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
            int cur=0,prev=0,max=0;
            while(n!=0)
            {
                if((n&1)==1) cur++;
                else
                {
                    prev=(n&2)==0?0:cur;
                    cur=0;
                }
                max=Math.max(max,prev+cur);
                n>>=1;
            }
            max++;
            sb.append(max+"\n");
        }
        System.out.print(sb);
    }
}
