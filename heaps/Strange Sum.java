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
            int n=Integer.parseInt(s[0]),c=Integer.parseInt(s[1])+Integer.parseInt(s[2]);
            PriorityQueue<Integer> pq=new PriorityQueue<>(Collections.reverseOrder());
            int i,a[]=new int[n];
            s=bu.readLine().split(" ");
            for(i=0;i<n;i++)
            a[i]=Integer.parseInt(s[i]);
            s=bu.readLine().split(" ");
            for(i=0;i<n;i++)
            {
                int x=Integer.parseInt(s[i]);
                x=Math.abs(a[i]-x);
                pq.add(x);
            }

            long ans=0;
            while(!pq.isEmpty())
            {
                int p=pq.poll();
                if(p!=0)
                {
                    if(c>0)
                    {
                        c--;
                        p--;
                        pq.add(p);
                    }
                    else ans+=1l*p*p;
                }
            }
            ans+=c%2;
            sb.append(ans+"\n");
        }
        System.out.print(sb);
    }
}
