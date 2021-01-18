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
            char s[]=bu.readLine().toCharArray();
            int i,n=s.length,cur=0,ans=0;
            for(i=0;i<n;i++)
            if(s[i]=='D' || s[i]=='L') cur++;
            else
            {
                if(cur==0) ans+=5;
                else cur--;
            }
            sb.append(ans+"\n");
        }
        System.out.print(sb);
    }
}
