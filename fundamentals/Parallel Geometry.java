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
            HashMap<Integer,Integer> hm=new HashMap<>();
            int i,k;
            for(i=0;i<12;i++)
            {
                k=Integer.parseInt(s[i]);
                hm.put(k,hm.getOrDefault(k,0)+1);
            }
            if(hm.size()<4)
            {
                boolean pos=true;
                for(int x:hm.values())
                if(x%4!=0) pos=false;
                if(pos) sb.append("yes\n");
                else sb.append("no\n");
            }
            else sb.append("no\n");
        }
        System.out.print(sb);
    }
}
