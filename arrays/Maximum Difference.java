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
            int n=Integer.parseInt(bu.readLine());
            String s[]=bu.readLine().split(" ");
            int i,a[]=new int[n],b[]=new int[n];
            for(i=0;i<n;i++)
            {
                a[i]=Integer.parseInt(s[i])+i;
                b[i]=a[i]-2*i;
            }

            int max=Integer.MIN_VALUE,min=Integer.MAX_VALUE;
            for(i=0;i<n;i++)
            {
                max=Math.max(max,a[i]);
                min=Math.min(min,a[i]);
            }
            int ans=max-min;
            max=Integer.MIN_VALUE; min=Integer.MAX_VALUE;
            for(i=0;i<n;i++)
            {
                max=Math.max(max,b[i]);
                min=Math.min(min,b[i]);
            }
            ans=Math.max(ans,max-min);
            sb.append(ans+"\n");
        }
        System.out.print(sb);
    }
}
