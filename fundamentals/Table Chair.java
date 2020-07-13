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
            String s[]=bu.readLine().split(" ");
            int r=Integer.parseInt(s[0]),n1=Integer.parseInt(s[1]),n2=Integer.parseInt(s[2]),n3=Integer.parseInt(s[3]);
            r=r%4;
            long ans=Long.MAX_VALUE;
            if(r==0) ans=0;
            else if(r==1)
            {
                ans=Math.min(ans,3l*n1);
                ans=Math.min(ans,n1+n2);
                ans=Math.min(ans,n3);
            }
            else if(r==2)
            {
                ans=Math.min(ans,2*n1);
                ans=Math.min(ans,n2);
                ans=Math.min(ans,2*n3);
            }
            else
            {
                ans=Math.min(ans,n1);
                ans=Math.min(ans,3l*n3);
                ans=Math.min(ans,n2+n3);
            }
            sb.append(ans+"\n");
        }
        System.out.print(sb);
    }
}
