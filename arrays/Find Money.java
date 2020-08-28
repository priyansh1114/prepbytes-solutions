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
            String s[]=bu.readLine().split(" ");
            int n=Integer.parseInt(s[0]),k=Integer.parseInt(s[1]);
            int i,a[]=new int[n],sum=0,cur=0;
            s=bu.readLine().split(" ");
            for(i=0;i<n;i++)
            {
                a[i]=Integer.parseInt(s[i]);
                sum+=a[i];
            }

            boolean found=false;
            for(i=0;i<n;i++)
            {
                cur+=a[i];
                if(a[i]==k) 
                {
                    found=true;
                    break;
                }
            }
            if(found) sb.append((cur-k)+" "+(sum-cur)+"\n");
            else sb.append("0\n");
        }
        System.out.print(sb);
    }
}
