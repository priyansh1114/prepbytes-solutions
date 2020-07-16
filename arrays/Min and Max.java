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
            int n=Integer.parseInt(bu.readLine()),i,k,min=Integer.MAX_VALUE,max=Integer.MIN_VALUE;
            String s[]=bu.readLine().split(" ");
            for(i=0;i<n;i++)
            {
                k=Integer.parseInt(s[i]);
                min=Math.min(min,k);
                max=Math.max(max,k);
            }
            sb.append(min+" "+max+"\n");
        }
        System.out.print(sb);
    }
}
