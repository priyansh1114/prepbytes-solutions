import java.io.*;
import java.util.*;

class Main
{
    public static void main(String args[])throws Exception
    {
        BufferedReader bu=new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb=new StringBuilder();
        int t=Integer.parseInt(bu.readLine().trim());
        while(t-->0)
        {
            String s[]=bu.readLine().trim().split(" ");
            int x=Integer.parseInt(s[0]),y=Integer.parseInt(s[1]);
            int ans=0;
            while(x>0 && y>0)
            {
                int p1=msb(x),p2=msb(y);
                if(p1!=p2) break;
                ans+=1<<p1;
                x-=1<<p1;
                y-=1<<p1;
            }
            sb.append(ans+"\n");
        }
        System.out.print(sb);
    }

    static int msb(int n)
    {
        int i=-1;
        while(n > 0)
        {
            n>>=1;
            i++;
        }
        return i;
    }
}
