import java.io.*;
import java.util.*;

class Main
{
    public static void main(String args[])throws Exception
    {
        BufferedReader bu=new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb=new StringBuilder();
        int n=Integer.parseInt(bu.readLine());
        int i,j,a[][]=new int[n][n];
        for(i=0;i<n;i++)
        {
            String s[]=bu.readLine().split(" ");
            for(j=0;j<n;j++)
            a[i][j]=Integer.parseInt(s[j]);
        }

        int r[]=new int[n+1],c[]=new int[n+1];
        int q=Integer.parseInt(bu.readLine());
        while(q-->0)
        {
            String s[]=bu.readLine().split(" ");
            int x=Integer.parseInt(s[0]),st=Integer.parseInt(s[1])-1,en=Integer.parseInt(s[2]),v=Integer.parseInt(s[3]);
            if(x==1)
            {
                r[st]^=v;
                r[en]^=v;
            }
            else
            {
                c[st]^=v;
                c[en]^=v;
            }
        }

        for(i=1;i<=n;i++)
        {
            r[i]^=r[i-1];
            c[i]^=c[i-1];
        }

        for(i=0;i<n;i++)
        {
            for(j=0;j<n;j++)
            {
                a[i][j]^=r[i]^c[j];
                sb.append(a[i][j]+" ");
            }
            sb.append("\n");
        }
        System.out.print(sb);
    }
}
