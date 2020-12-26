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
            int n=Integer.parseInt(bu.readLine());
            char s[]=bu.readLine().toCharArray();
            int i,j,c[]=new int[26];
            for(i=0;i<n;i++)
            c[s[i]-'a']++;

            boolean found=false;
            for(i=0;i<26;i++)
            {
                int sm=0,la=0;
                for(j=0;j<i;j++)
                sm+=c[j];
                for(j=i+1;j<26;j++)
                la+=c[j];
                if(sm==la) {found=true; break;}
            }
            if(found) sb.append("YES\n");
            else sb.append("NO\n");
        }
        System.out.print(sb);
    }
}
