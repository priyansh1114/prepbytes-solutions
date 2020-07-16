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
            String s[]=bu.readLine().split(" ");
            int n=Integer.parseInt(s[0]),m=Integer.parseInt(s[1]);
            int ans1=(n/2)*m+((n%2==0)?0:m/2),ans2=(m/2)*n+((m%2==0)?0:n/2);
            sb.append(Math.max(ans1,ans2)+"\n");
        }
        System.out.print(sb);
    }
}
