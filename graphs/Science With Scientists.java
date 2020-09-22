import java.io.*;
import java.util.*;

class Main
{
    public static void main(String args[])throws Exception
    {
        BufferedReader bu=new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb=new StringBuilder();
        String s[]=bu.readLine().split(" ");
        int n=Integer.parseInt(s[0]),e=Integer.parseInt(s[1]),i;
        ArrayList<Integer> g[]=new ArrayList[n];
        for(i=0;i<n;i++)
        g[i]=new ArrayList<>();

        int c,ans=0;
        for(i=0;i<e;i++)
        {
            s=bu.readLine().split(" ");
            int u=Integer.parseInt(s[0]),v=Integer.parseInt(s[1]);
            g[u].add(v);
            g[v].add(u);
        }
        boolean vis[]=new boolean[n];

        for(i=0;i<n;i++)
        if(!vis[i])
        {
            c=1;
            vis[i]=true;
            Queue<Integer> q=new LinkedList<>();
            q.add(i);
            while(!q.isEmpty())
            {
                int p=q.poll();
                for(int x:g[p])
                if(!vis[x])
                {
                    vis[x]=true;
                    q.add(x);
                    c++;
                }
            }
            ans+=c*(n-c);
        }
        ans/=2;
        System.out.print(ans);
    }
}
