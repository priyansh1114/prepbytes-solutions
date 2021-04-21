import java.io.*;
import java.util.*;

class Main
{
    public static void main(String args[])throws Exception
    {
        BufferedReader bu=new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb=new StringBuilder();
        String s[]={"zero","one","two","three","four","five","six","seven","eight","nine"};

        int a=Integer.parseInt(bu.readLine().trim()),b=Integer.parseInt(bu.readLine().trim()),i;
        for(i=a;i<=b;i++)
        if(i<=9) sb.append(s[i]+"\n");
        else if(i%2==0) sb.append("even\n");
        else sb.append("odd\n");
        System.out.print(sb);
    }
}
