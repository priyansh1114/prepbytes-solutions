import java.io.*;
import java.util.*;

class Main
{
    public static void main (String[] args) throws Exception
    {
        BufferedReader bu=new BufferedReader(new InputStreamReader(System.in));
        int n=Integer.parseInt(bu.readLine());
        int i,max=(int)Math.pow(2,n),a[]=new int[n];
        for(i=0;i<n;i++)
        a[i]=Integer.parseInt(bu.readLine());
        boolean ans=false;
        for(i=0;i<max;i++)
        {
            int b[]=new int[n],x=0,v=i;
            while(v!=0)
            {
                if((v&1)==1) b[x]++;
                x++;
                v>>=1;
            }
            int sum=0;
            for(x=0;x<n;x++)
            if(b[x]==0) sum+=a[x];
            else sum-=a[x];
            if(sum==0 || sum==360) ans=true;
            if(ans) break;
        }
        if(ans) System.out.print("YES");
        else System.out.print("NO");
    }
}
