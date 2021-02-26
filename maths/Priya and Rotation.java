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
            int n=Integer.parseInt(s[0]),x=Integer.parseInt(s[1]);
            long p=1,sum=0;
            while(sum+p<n)
            {
                sum+=p;
                p*=2;
            }
            n-=sum;
            if(x==2) sb.append(2*n-1);
            else sb.append(p-n+1);
            sb.append("\n");
        }
        System.out.print(sb);
    }
}
