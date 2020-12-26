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
            PriorityQueue<Long> pq=new PriorityQueue<>(Collections.reverseOrder());
            int i; long ka=0,kr=0,a;
            HashMap<Long,Integer> hm=new HashMap<>();
            String s[]=bu.readLine().split(" ");
            for(i=0;i<n;i++)
            {
                a=Long.parseLong(s[i]);
                pq.add(a);
                hm.put(a,hm.getOrDefault(a,0)+1);
            }
            boolean first=true;
            while(!pq.isEmpty())
            {
                a=pq.poll();
                if(hm.get(a)==1)
                {
                    if(first) ka+=a;
                    else kr+=a;
                    pq.add(a/2);
                    hm.put(a/2,hm.getOrDefault(a/2,0)+1);
                }
                else while(!pq.isEmpty() && pq.peek()==a) pq.poll();
                first=!first;
            }
            if(ka>kr) sb.append("KARMA\n");
            else if(ka==kr) sb.append("DRAW\n");
            else sb.append("KRSNA\n");
        }
        System.out.print(sb);
    }
}
