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
        int i,a[]=new int[n];
        ArrayList<Integer> g[]=new ArrayList[n];
        for(i=0;i<n;i++) g[i]=new ArrayList<>();
        s=bu.readLine().split(" ");
        for(i=0;i<n;i++)
        a[i]=Integer.parseInt(s[i]);
        int to[]=new int[n];
        for(i=0;i<m;i++)
        {
            s=bu.readLine().split(" ");
            int u=Integer.parseInt(s[0])-1,v=Integer.parseInt(s[1])-1;
            g[u].add(v);
            to[v]++;
        }
        int min[]=new int[n]; long ans=Long.MIN_VALUE;
        for(i=0;i<n;i++) min[i]=Integer.MAX_VALUE;
        for(i=0;i<n;i++)
        {
            if(to[i]>0) ans=Math.max(ans,a[i]-min[i]);
            min[i]=Math.min(a[i],min[i]);
            for(int x:g[i]) min[x]=Math.min(min[i],min[x]);
        }
        if(ans>=0) sb.append("Profit ");
        else sb.append("Loss ");
        sb.append(ans+"\n");
        System.out.print(sb);
    }
}
