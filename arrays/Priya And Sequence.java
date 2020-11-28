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
            int n=Integer.parseInt(bu.readLine()),a,i,b;
            long max=0,sum=0;
            String s[]=bu.readLine().split(" ");
            a=Integer.parseInt(s[0]);
            max=sum=a;
            for(i=1;i<n;i++)
            {
                b=Integer.parseInt(s[i]);
                if(b==a) sum+=b;
                else
                {
                    max=Math.max(max,sum);
                    sum=b;
                }
                a=b;
            }
            max=Math.max(max,sum);
            sb.append(max+"\n");
        }
        System.out.print(sb);
    }
}
