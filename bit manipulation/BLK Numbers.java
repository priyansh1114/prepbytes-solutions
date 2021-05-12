import java.io.*;
import java.util.*;

class Main
{
    public static void main(String args[])throws Exception
    {
        BufferedReader bu=new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb=new StringBuilder();
        int n=Integer.parseInt(bu.readLine().trim());
        int i;
        boolean ans=false;
        for(i=1;i<=n;i++)
        {
            int x=i,c=0;
            while(x>0)
            {
                if(x%2==1) c++;
                x>>=1;
            }
            if(i+c==n) {ans=true; break;}
        }
        if(ans) sb.append("No\n");
        else sb.append("Yes\n");
        System.out.print(sb);
    }
}
