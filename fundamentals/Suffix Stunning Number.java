import java.io.*;
import java.util.*;
class Main
{
    public static void main(String args[])throws Exception
    {
        BufferedReader bu=new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb=new StringBuilder();
        int i,t=1;
        long p[]=new long[12];
        p[0]=1;
        for(i=1;i<12;i++)
        p[i]=p[i-1]*10;

        while(t-->0)
        {
            String s[]=bu.readLine().split(" ");
            long n=Long.parseLong(s[0]); char m[]=s[1].toCharArray();
            long ans=0;
            int sn=(int)Math.log10(n)+1,l=m.length-1;
            for(i=0;i<m.length-sn;i++)
            {
                ans+=(p[l]/p[sn])*(m[i]-'0');
                l--;
            }
            long x=Long.parseLong(s[1]);
            if(x%p[sn]>=n) ans++;
            sb.append(ans+"\n");
        }
        System.out.print(sb);
    }
}
