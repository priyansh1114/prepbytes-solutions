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
            int i,ans=Integer.parseInt(s[0]);
            for(i=1;i<n;i++)
            ans^=Integer.parseInt(s[i]);
            sb.append(ans+"\n");
        }
        System.out.print(sb);
    }
}
