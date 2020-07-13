import java.io.*;
import java.util.*;

class Main
{
    public static void main (String[] args) throws Exception
    {
        BufferedReader bu=new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb=new StringBuilder();
        int i,t=Integer.parseInt(bu.readLine());
        while(t-->0)
        {
            long n=Integer.parseInt(bu.readLine());
            while(n!=1)
            {
                sb.append(n+" ");
                if(n%2==0) n=(long)Math.sqrt(n);
                else
                {
                    double v=Math.sqrt(n);
                    n=(long)Math.floor(v*v*v);
                }
            }
            sb.append("1\n");
        }
        System.out.print(sb);
    }
}
