import java.io.*;
import java.util.*;

class Main
{
    public static void main (String[] args) throws Exception
    {
        BufferedReader bu=new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb=new StringBuilder();
        int t=Integer.parseInt(bu.readLine()),i;
        long fac[]=new long[21];
        fac[0]=1;
        for(i=1;i<=20;i++)
        fac[i]=fac[i-1]*i;

        while(t-->0)
        {
            String s[]=bu.readLine().split(" ");
            int m=Integer.parseInt(s[0]),w=Integer.parseInt(s[1]),x=Integer.parseInt(s[2]),y=Integer.parseInt(s[3]);
            long ans=(fac[m]/(fac[x]*fac[m-x]))*(fac[w]/(fac[y]*fac[w-y]))*fac[x+y];
            sb.append(ans+"\n");
        }
        System.out.print(sb);
    }
}
