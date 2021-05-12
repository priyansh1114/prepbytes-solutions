//vive la leetcode
import java.io.*;
import java.util.*;

class Main
{
    public static void main(String args[])throws Exception
    {
        BufferedReader bu=new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb=new StringBuilder();
        int t=Integer.parseInt(bu.readLine().trim());
        while(t-->0)
        {
            String s[]=bu.readLine().trim().split(" ");
            long n=Integer.parseInt(s[0]),d=Integer.parseInt(s[1]);
            if(n==0) {sb.append("0\n"); continue;}

            StringBuilder res = new StringBuilder();
            // "+" or "-"
            res.append(((n>0)^(d>0))?"-" :"");
            n=Math.abs(n);
            d=Math.abs(d);

            // integral part
            res.append(n/d);
            n%=d;
            if(n== 0)
            {
                sb.append(res);
                sb.append("\n");
                continue;
            }

            // fractional part
            res.append(".");
            HashMap<Long,Integer> hm=new HashMap<>();
            hm.put(n,res.length());
            while(n!=0)
            {
                n*=10;
                res.append(n/d);
                n%=d;
                if(hm.containsKey(n))
                {
                    int i=hm.get(n);
                    res.insert(i, "(");
                    res.append(")");
                    break;
                }
                else hm.put(n,res.length());
            }
            sb.append(res+"\n");
        }
        System.out.print(sb);
    }
}
