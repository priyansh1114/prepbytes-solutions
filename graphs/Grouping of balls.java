import java.io.*;
import java.util.*;

class Main
{
    public static void main(String args[])throws Exception
    {
        BufferedReader bu=new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb=new StringBuilder();
        String s[]=bu.readLine().split(" ");
        int n=Integer.parseInt(s[0]),m=Integer.parseInt(s[1]);
        int i,a[][]=new int[m][2];
        for(i=0;i<m;i++)
        {
            s=bu.readLine().split(" ");
            int u=Integer.parseInt(s[0]),v=Integer.parseInt(s[1]);
            if(u>v) u=u^v^(v=u);
            a[i][0]=u; a[i][1]=v;
        }
        boolean ans=bipartition(n,a);
        if(ans) sb.append("Yes\n");
        else sb.append("No\n");
        System.out.println(sb);
    }

    static boolean bipartition(int n, int[][] dis)
    {
        Queue<Integer> q=new LinkedList<>();
        int vis[]=new int[n+1],i,j;
        Arrays.fill(vis,-1);
        for(i=1;i<=n;i++)
        if(vis[i]==-1)
        {
            vis[i]=0;
            q.add(i);
            while(!q.isEmpty())
            {
                int u=q.poll();
                for(j=0;j<dis.length;j++)
                if(dis[j][0]==u || dis[j][1]==u)
                {
                    int v=(dis[j][0]==u?dis[j][1]:dis[j][0]);
                    if(vis[v]==-1)
                    {vis[v]=(vis[u]==0?1:0);
                    q.add(v);}
                    else if(vis[v]==vis[u]) return false;
                }
            }
        }
        return true;
    }
}
