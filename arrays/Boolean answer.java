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
            int n=Integer.parseInt(s[0]),m=Integer.parseInt(s[1]),r=-1,max=0,i;
            for(i=0;i<n;i++)
            {
                s=bu.readLine().split(" ");
                int c=0,j,k;
                for(j=0;j<m;j++)
                {
                    k=Integer.parseInt(s[j]);
                    if(k==1) c++;
                }
                if(c>max) {max=c; r=i;}
            }
            sb.append(r+"\n");
        }
        System.out.print(sb);
    }
}
