import java.io.*;
import java.util.*;

class Main
{
    public static void main(String args[])throws Exception
    {
        BufferedReader bu=new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb=new StringBuilder();
        int t=Integer.parseInt(bu.readLine()),N=1000000,c[]=new int[N];
        while(t-->0)
        {
            int n=Integer.parseInt(bu.readLine());
            int i,a,max=0;
            String s[]=bu.readLine().split(" ");
            for(i=0;i<n;i++)
            {
                a=Integer.parseInt(s[i]);
                c[a]++;
                max=Math.max(max,a);
            }
            boolean pos=true;
            for(i=1;i<=max;i++)
            {
                pos&=(c[i]!=0);
                c[i]=0;
            }
            if(pos) sb.append("YES\n");
            else sb.append("NO\n");
        }
        System.out.print(sb);
    }
}
