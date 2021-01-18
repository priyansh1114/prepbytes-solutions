import java.io.*;
import java.util.*;

class Main
{
    public static void main(String args[])throws Exception
    {
        FastReader fr=new FastReader();
        StringBuilder sb=new StringBuilder();
        int t=fr.nextInt();
        while(t-->0)
        {
            int n=fr.nextInt(),i;
            g=new ArrayList[n];
            for(i=0;i<n;i++)
            g[i]=new ArrayList<>();

            int sum[]=new int[n],a[]=new int[n],e[][]=new int[n][3];
            for(i=0;i<n-1;i++)
            {
                int u=fr.nextInt()-1,v=fr.nextInt()-1,w=fr.nextInt();
                e[i][0]=u; e[i][1]=v; e[i][2]=w%2;
                g[u].add(v);
                g[v].add(u);
            }
            d=new int[n];
            Queue<Integer> q=new LinkedList<>();
            Queue<Integer> pa=new LinkedList<>();
            q.add(0); pa.add(0);
            boolean vis[]=new boolean[n];
            vis[0]=true;
            while(!q.isEmpty())
            {
                int u=q.poll(),v=pa.poll();
                par[u][0]=v;
                d[u]=d[v]+1;
                for(i=1;i<=lg;i++)
                par[u][i]=par[par[u][i-1]][i-1];

                for(int x:g[u])
                if(!vis[x])
                {
                    q.add(x);
                    vis[x]=true;
                    pa.add(u);
                }
            }

            for(i=0;i<n-1;i++)
            {
                if(d[e[i][0]]>d[e[i][1]]) a[e[i][0]]+=e[i][2];
                else a[e[i][1]]+=e[i][2];
            }

            q.add(0); sum[0]=a[0];
            while(!q.isEmpty())
            {
                int p=q.poll();
                for(int x:g[p])
                if(d[x]>d[p])
                {
                    q.add(x);
                    sum[x]=sum[p]+a[x];
                }
            }

            int qr=fr.nextInt();
            while(qr-->0)
            {
                int u=fr.nextInt()-1,v=fr.nextInt()-1;
                int l=lca(u,v);
                //if(u>=n || v>=n || l>=n) continue;
                long ans=sum[u]+sum[v]-2*sum[l];
                ans%=2;
                if(ans==0) sb.append("EVEN PATH\n");
                else sb.append("ODD PATH\n");
            }

            if(t!=0)
            for(i=0;i<n;i++)
            Arrays.fill(par[i],0);
        }
        System.out.print(sb);
    }
    static ArrayList<Integer> g[];
    static int d[],lg=19,par[][]=new int[100010][lg+1];

    static int lca(int u,int v)
    {
        if(d[u]<d[v]) u=u^v^(v=u);
        int i;
        for(i=lg;i>=0;i--)
        if(d[par[u][i]]>=d[v]) u=par[u][i];
        if(u==v) return u;
        for(i=lg;i>=0;i--)
        if(par[u][i]!=par[v][i])
        {
            u=par[u][i];
            v=par[v][i];
        }
        return par[u][0];
    }

    static class FastReader
    {
        final private int BUFFER_SIZE=1<<16;
        private DataInputStream dis;
        private byte[] buffer;
        private int bufferPointer,bytesRead;

        public FastReader()
        {
            dis=new DataInputStream(System.in);
            buffer=new byte[BUFFER_SIZE];
            bufferPointer=bytesRead=0;
        }

        public int nextInt() throws IOException
        {
            int ret=0;
            byte c=read();
            while(c<=' ') c=read();
            boolean neg=(c=='-');
            if(neg) c=read();
            do
            {
                ret=ret*10+c-'0';
            }while((c=read())>='0' && c<='9');
            if(neg) return -ret;
            return ret;
        }

        private void fillBuffer()throws IOException
        {
            bytesRead=dis.read(buffer,bufferPointer=0,BUFFER_SIZE);
            if(bytesRead==-1) buffer[0]=-1;
        }
        private byte read() throws IOException
        {
            if(bufferPointer==bytesRead) fillBuffer();
            return buffer[bufferPointer++];
        }
    }
}
