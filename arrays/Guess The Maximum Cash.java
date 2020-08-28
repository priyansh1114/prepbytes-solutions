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
            int n=Integer.parseInt(s[0]),m=Integer.parseInt(s[1]),x=Integer.parseInt(s[2]),y=Integer.parseInt(s[3]);
            int max=n*(y-1)+x;
            int ans=1,i;
            for(i=2;i*i<=max;i++)
            if(max%i==0)
            {
                ans=i;
                while(max%i==0)
                max/=i;
            }
            if(max>=2) ans=Math.max(ans,max);
            sb.append("$ "+ans+"\n");
        }
        System.out.print(sb);
    }
}
