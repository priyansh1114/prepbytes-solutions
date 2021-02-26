import java.io.*;
import java.util.*;

class Main
{
    public static void main(String args[])throws Exception
    {
        BufferedReader bu=new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb=new StringBuilder();
        int t=Integer.parseInt(bu.readLine());
        int N=100000; boolean c[]=new boolean[N+5];
        while(t-->0)
        {
            int i,n=Integer.parseInt(bu.readLine()),a;
            String s[]=bu.readLine().split(" ");
            for(i=0;i<n;i++)
            {
                a=Integer.parseInt(s[i]);
                c[a]=true;
            }

            boolean pos=false;
            for(i=1;i<=N;i++)
            if(c[i] && c[i+1] && c[i+2]) {pos=true; break;}
            if(pos) sb.append("YES\n");
            else sb.append("NO\n");
            if(t!=0)
            for(i=1;i<=N;i++) c[i]=false;
        }
        System.out.print(sb);
    }
}
