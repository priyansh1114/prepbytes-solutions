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
            int n=Integer.parseInt(bu.readLine()),i,sum=1;
            for(i=2;i*i<=n;i++)
            if(n%i==0)
            {
                sum+=i;
                if(n/i!=i) sum+=n/i;
            }
            if(sum==n && n!=1) sb.append("true\n");
            else sb.append("false\n");
        }
        System.out.print(sb);
    }
}
