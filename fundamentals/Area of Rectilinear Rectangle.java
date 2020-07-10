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
            String s[]=bu.readLine().split(" ");
            int a=Integer.parseInt(s[0])+500,b=Integer.parseInt(s[1])+500,c=Integer.parseInt(s[2])+500,d=Integer.parseInt(s[3])+500,
                e=Integer.parseInt(s[4])+500,f=Integer.parseInt(s[5])+500,g=Integer.parseInt(s[6])+500,h=Integer.parseInt(s[7])+500;
            int xy[][]=new int[1001][1001],i,j;
            for(i=a;i<c;i++)
            for(j=b;j<d;j++)
            xy[j][i]++;
            for(i=e;i<g;i++)
            for(j=f;j<h;j++)
            xy[j][i]++;
            int ans=0;
            for(i=0;i<=1000;i++)
            for(j=0;j<=1000;j++)
            if(xy[i][j]!=0) ans++;
            sb.append(ans+"\n");
        }
        System.out.print(sb);
    }
}
