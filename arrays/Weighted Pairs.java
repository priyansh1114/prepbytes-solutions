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
            int a[]=new int[n],i,c[]=new int[1001];
            String s[]=bu.readLine().split(" ");
            for(i=0;i<n;i++)
            {
                a[i]=Integer.parseInt(s[i]);
                c[a[i]]++;
            }

            int j,sum=0,max=0;
            for(i=2;i<=2000;i++)
            {
                int cur=0;
                for(j=0;j<n;j++)
                if(c[a[j]]>0)
                {
                    int ot=i-a[j];
                    if(ot<=0 || ot>1000) continue;
                    c[a[j]]--;
                    if(c[ot]>0)
                    {
                        cur++;
                        c[ot]--;
                    }
                    else c[a[j]]++;
                }
                if(cur>max)
                {
                    max=cur;
                    sum=i;
                }
                for(j=0;j<n;j++) c[a[j]]=0;
                for(j=0;j<n;j++) c[a[j]]++;
            }
            sb.append(max+" "+sum+"\n");
        }
        System.out.print(sb);
    }
}
