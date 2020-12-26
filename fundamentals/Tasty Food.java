import java.io.*;
import java.util.*;

class Main
{
    public static void main(String args[])throws Exception
    {
        BufferedReader bu=new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb=new StringBuilder();
        String s[]=bu.readLine().split(" ");
        int n=Integer.parseInt(s[0]),k=Integer.parseInt(s[1]);
        s=bu.readLine().split(" ");
        int i,c=0,a;
        for(i=0;i<n;i++)
        {
            a=Integer.parseInt(s[i]);
            c+=a;
        }
        c=Math.abs(c);
        c=c/k+(c%k==0?0:1);
        System.out.print(c);
    }
}
