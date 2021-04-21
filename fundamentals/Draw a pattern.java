import java.io.*;
import java.util.*;

class Main
{
    public static void main(String args[])throws Exception
    {
        BufferedReader bu=new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb=new StringBuilder();
        int n=Integer.parseInt(bu.readLine().trim());
        int i,j,N=200000;
        char c[][]=new char[3][N];
        for(i=0;i<3;i++) Arrays.fill(c[i],' ');

        i=2; j=0; boolean inc=false;
        while(n>0)
        {
            n--;
            c[i][j]='*';
            if(!inc) i--;
            else i++;
            j+=2;
            if(i==3 || i==-1)
            {
                i=1;
                inc=!inc;
            }
        }

        for(i=0;i<3;i++)
        {
            int last=0;
            for(j=0;j<N;j++)
            if(c[i][j]=='*') last=j;
            for(j=0;j<=last;j++) sb.append(c[i][j]);
            sb.append("\n");
        }
        System.out.print(sb);
    }
}
