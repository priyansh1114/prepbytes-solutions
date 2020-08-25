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
            int n=Integer.parseInt(bu.readLine()),i,ans=0;
            for(i=0;i<n;i++)
            {
                char s[]=bu.readLine().toCharArray();
                int j,f=0,c[]=new int[26];
                for(j=0;j<s.length;j++)
                c[s[j]-'a']++;
                for(j=0;j<26;j++)
                if(c[j]%2==1) f++;
                if(f<2) ans++;
            }
            sb.append(ans+"\n");
        }
        System.out.print(sb);
    }
}
