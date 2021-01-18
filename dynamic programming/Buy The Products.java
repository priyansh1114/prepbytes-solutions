import java.io.*;
import java.util.*;

class Main
{
    public static void main(String args[])throws Exception
    {
        BufferedReader bu=new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb=new StringBuilder();
        String s[]=bu.readLine().split(" ");
        int n=Integer.parseInt(s[0]),x=Integer.parseInt(s[1]),m=Math.max(9,x+3);
        boolean dp[][]=new boolean[n][m];
        int i,j,k,u;
        for(i=0;i<n;i++)
        {
            s=bu.readLine().split(" ");
            for(j=0;j<10;j++)
            {
                u=Integer.parseInt(s[j]);
                if(u==-1) continue;
                if(i==0) {dp[i][u]=true; continue;}
                for(k=0;k<m;k++)
                if(dp[i-1][k])
                {
                    if(k+u>=m) dp[i][m-1]=true;
                    else dp[i][k+u]=true;
                }
            }
        }
        if(dp[n-1][x]) sb.append("Yes");
        else sb.append("No");
        System.out.print(sb);
    }
}
