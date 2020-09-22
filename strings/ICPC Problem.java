import java.io.*;
import java.util.*;

class Main
{
    public static void main(String args[])throws Exception
    {
        BufferedReader bu=new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb=new StringBuilder();
        int t=Integer.parseInt(bu.readLine().trim());
        while(t-->0)
        {
            String s=bu.readLine().trim();
            int n=s.length(),i,a[]=new int[n];
            for(i=0;i<n;i++)
            a[i]=s.charAt(i)-'0';
            
            int max=(int)Math.pow(2,n)-1,j;
            long ans=1,M=1000000007;
            HashMap<Long,Integer> hm=new HashMap<>();
            for(i=1;i<=max;i++)
            {
                int cur=(i>>0)&1; long cp=a[0],prod=1;
                for(j=1;j<n;j++)
                if(((i>>j)&1)==cur) cp=((10*cp)+a[j])%M;
                else
                {
                    prod=prod*cp%M;
                    cp=a[j];
                    cur^=1;
                }
                prod=prod*cp%M;
                hm.put(prod,hm.getOrDefault(prod,0)+1);
            }

            for(long x:hm.keySet())
            {
                int times=(hm.get(x)+1)/2;
                while(times!=0)
                {
                    ans=ans*x%M;
                    times--;
                }
            }
            sb.append(ans+"\n");
        }
        System.out.print(sb);
    }
}
