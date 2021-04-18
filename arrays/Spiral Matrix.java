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
            String s[]=bu.readLine().split(" ");
            int n=Integer.parseInt(s[0]),m=Integer.parseInt(s[1]),i,j,a[][]=new int[n][m];
            for(i=0;i<n;i++)
            {
                s=bu.readLine().split(" ");
                for(j=0;j<m;j++)
                a[i][j]=Integer.parseInt(s[j]);
            }

            int l=0,r=m-1,u=0,d=n-1; boolean vis[][]=new boolean[n][m];
            while(l<=r && u<=d)
            {
                for(i=l;i<=r;i++)
                if(!vis[u][i])
                {
                    sb.append(a[u][i]+" ");
                    vis[u][i]=true;
                }
                for(i=u+1;i<=d;i++)
                if(!vis[i][r])
                {
                    sb.append(a[i][r]+" ");
                    vis[i][r]=true;
                }
                for(i=r-1;i>=l;i--)
                if(!vis[d][i])
                {
                    sb.append(a[d][i]+" ");
                    vis[d][i]=true;
                }
                for(i=d-1;i>u;i--)
                if(!vis[i][l])
                {
                    sb.append(a[i][l]+" ");
                    vis[i][l]=true;
                }
                l++; u++; d--; r--;
            }
            sb.append("\n");
        }
        System.out.print(sb);
    }
}
