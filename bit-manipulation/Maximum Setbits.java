import java.io.*;
import java.util.*;

public class Main
{
    public static void main (String[] args) throws Exception
    {
        BufferedReader bu=new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb=new StringBuilder();
        int t=Integer.parseInt(bu.readLine().trim()),i;
        long p2[]=new long[63];
        p2[0]=1;
        for(i=1;i<63;i++)
        p2[i]=p2[i-1]*2;
        while(t-->0)
        {
            String s[]=bu.readLine().split(" ");
            long l=Long.parseLong(s[0]),r=Long.parseLong(s[1]);
            long ans=l;
            for(i=0;i<63;i++)
            if((l&(1l<<i))==0 && ans+p2[i]<=r) ans+=p2[i];
            sb.append(ans+"\n");
        }
        System.out.print(sb);
    }
}
