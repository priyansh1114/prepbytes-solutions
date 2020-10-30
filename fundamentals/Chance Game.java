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
            int p=Integer.parseInt(s[0]),s1=Integer.parseInt(s[1]),s2=Integer.parseInt(s[2]);
            if(s1<s2) s1=s1^s2^(s2=s1);
            int moves=0;
            while(s1<p || s1-s2<2)
            {
                moves++;
                s1++;
            }
            sb.append(moves+"\n");
        }
        System.out.print(sb);
    }
}
