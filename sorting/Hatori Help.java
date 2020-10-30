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
            String s[]=bu.readLine().split(" ");
            int n=Integer.parseInt(s[0]),k=Integer.parseInt(s[1]),i;
            Integer a[]=new Integer[n],b[]=new Integer[n];
            s=bu.readLine().split(" ");
            for(i=0;i<n;i++)
            a[i]=Integer.parseInt(s[i]);
            s=bu.readLine().split(" ");
            for(i=0;i<n;i++)
            b[i]=Integer.parseInt(s[i]);

            Arrays.sort(a); Arrays.sort(b,Collections.reverseOrder());
            long sum1=0,sum2=0;
            for(i=0;i<k;i++)
            {
                sum1+=a[i];
                sum2+=b[i];
            }
            if(sum1>sum2) sb.append("WIN\n");
            else sb.append("LOSE\n");
        }
        System.out.print(sb);
    }
}
