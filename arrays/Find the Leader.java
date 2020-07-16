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
            int i,k,max=0;
            for(i=n-1;i>=0;i--)
            {
                k=Integer.parseInt(s[i]);
                if(k>=max)
                {
                    max=k;
                    sb.append(k+" ");
                }
            }
            sb.append("\n");
        }
        System.out.print(sb);
    }
}
