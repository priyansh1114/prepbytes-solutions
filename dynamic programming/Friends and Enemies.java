import java.io.*;
import java.util.*;

class Main
{
    public static void main(String args[])throws Exception
    {
        BufferedReader bu=new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb=new StringBuilder();
        int n=Integer.parseInt(bu.readLine()),i,a[]=new int[n];
        String s[]=bu.readLine().split(" ");
        for(i=0;i<n;i++)
        a[i]=Integer.parseInt(s[i]);

        HashMap<Integer,Long> hm=new HashMap<>();
        long ans=0,M=1000000007;
        for(i=0;i<n;i++)
        {
            HashMap<Integer,Long> t=new HashMap<>();
            hm.put(0,hm.getOrDefault(0,0l)+1);
            for(int x:hm.keySet())
            {
                long y=hm.get(x);
                int k=x-a[i];
                t.put(k,(t.getOrDefault(k,0l)+y)%M);
                k=x+a[i];
                t.put(k,(t.getOrDefault(k,0l)+y)%M);
            }
            hm=t;
            ans=(ans+hm.getOrDefault(0,0l))%M;
        }
        System.out.print(ans);
    }

}
