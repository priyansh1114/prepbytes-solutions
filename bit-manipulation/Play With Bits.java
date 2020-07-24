import java.io.*;
import java.util.*;

class Main
{
    public static void main (String[] args) throws Exception
    {
        BufferedReader bu=new BufferedReader(new InputStreamReader(System.in));
        String s[]=bu.readLine().split(" ");
        long l=Long.parseLong(s[0]),r=Long.parseLong(s[1]),p2[]=new long[63],x;
        int i,j,k,c=0,msl=0,msr=0;
        p2[0]=1;
        for(i=1;i<63;i++) p2[i]=p2[i-1]*2l;

        for(i=0;i<63;i++)
        {
            for(j=i-1;j>=0;j--)
            {
                long v=0;
                for(k=i;k>=0;k--)
                if(k==j) continue;
                else v+=p2[k];
                if(v>=l && v<=r) c++;
            }
        }
        System.out.print(c);
    }
}
