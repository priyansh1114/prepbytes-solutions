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
            int n=Integer.parseInt(bu.readLine());
            int a[]=new int[n],i;
            for(i=0;i<n;i++)
            a[i]=9;

            int x=n/4; i=n-1;
            while(x>0)
            {
                a[i]=0;
                x--;
                i--;
            }
            x=n%4;
            if(x!=0) a[i]=8;
            for(i=0;i<n;i++)
                sb.append(a[i]);
            sb.append("\n");
        }
        System.out.print(sb);
    }
}
