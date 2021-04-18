import java.io.*;
import java.util.*;

class Main
{
    public static void main(String args[])throws Exception
    {
        BufferedReader bu=new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb=new StringBuilder();
        int n=Integer.parseInt(bu.readLine());
        String s[]=bu.readLine().split(" ");
        int i,x;
        Set<Integer> set=new HashSet<>();
        for(i=0;i<n;i++)
        {
            x=Integer.parseInt(s[i]);
            while(x%2==0) x/=2;
            while(x%3==0) x/=3;
            set.add(x);
        }
        if(set.size()==1) sb.append("YES\n");
        else sb.append("NO\n");
        System.out.print(sb);
    }
}
