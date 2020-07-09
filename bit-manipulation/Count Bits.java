import java.io.*;
import java.util.*;

class Main
{
    public static void main (String[] args) throws Exception
    {
        BufferedReader bu=new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb=new StringBuilder();
        int t=Integer.parseInt(bu.readLine()),N=100000,i,c[][]=new int[N+1][30];
        for(i=1;i<=N;i++)
        {
            int x=0,d=i;
            while(d!=0)
            {
                if((d&1)==1) c[i][x]++;
                x++;
                d>>=1;
            }
            for(x=0;x<30;x++)
            c[i][x]+=c[i-1][x];
        }
        while(t-->0)
        {
            int n=Integer.parseInt(bu.readLine()),sum=0;
            for(i=0;i<30;i++)
                sum+=c[n][i];
            sb.append(sum+"\n");
        }
        System.out.print(sb);
    }
}
