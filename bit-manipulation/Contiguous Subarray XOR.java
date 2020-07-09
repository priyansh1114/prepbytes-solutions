import java.io.*;
import java.util.*;

class Main
{
    public static void main (String[] args) throws Exception
    {
        BufferedReader bu=new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb=new StringBuilder();
        int t=Integer.parseInt(bu.readLine());
        while(t-->0)
        {
            int n=Integer.parseInt(bu.readLine()),i;
            String s[]=bu.readLine().split(" ");
            long ans=0;
            for(i=0;i<n;i++)
            {
                long k=Long.parseLong(s[i]),freq=1l*(i+1)*(n-i);
                if(freq%2==1) ans^=k;
            }
            sb.append(ans+"\n");
        }
        System.out.print(sb);
    }
}
