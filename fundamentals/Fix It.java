import java.io.*;
import java.util.*;

class Main
{
    public static void main(String args[])throws Exception
    {
        BufferedReader bu=new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb=new StringBuilder();
        int t=Integer.parseInt(bu.readLine());
        while(t-->0)
        {
            char s[]=bu.readLine().trim().toCharArray();
            int u=0,i,n=s.length;
            for(i=0;i<n;i++)
            if(s[i]=='U') u++;
            n/=2;
            int ans=Math.abs(u-n);
            sb.append(ans+"\n");
        }
        System.out.print(sb);
    }
}
