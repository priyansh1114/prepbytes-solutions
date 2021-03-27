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
            int a[]=new int[n],suma=0,sumc=0,c,i;
            String s[]=bu.readLine().split(" ");
            for(i=0;i<n;i++)
            {
                a[i]=Integer.parseInt(s[i]);
                suma+=a[i];
            }
            boolean pos=true,add=false;
            s=bu.readLine().split(" ");
            for(i=0;i<n;i++)
            {
                c=Integer.parseInt(s[i]);
                if(c<a[i]) pos=false;
                sumc+=c;
                if(c>a[i]) add=true;
            }
            if(pos && sumc-suma>1 && add) sb.append("YES\n");
            else sb.append("NO\n");
        }
        System.out.print(sb);
    }
}
