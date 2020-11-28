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
            int n=Integer.parseInt(s[0]),d=Integer.parseInt(s[1]),i;
            Integer a[]=new Integer[n+1];
            s=bu.readLine().split(" ");
            for(i=0;i<n;i++)
            a[i]=Integer.parseInt(s[i]);
            a[i]=d;
            Arrays.sort(a);
            if(n%2==0) sb.append("1\n");
            else
            {
                n++;
                int mid=n/2;
                int ans=a[mid]-a[mid-1]+1;
                sb.append(ans+"\n");
            }
        }
        System.out.print(sb);
    }
}
