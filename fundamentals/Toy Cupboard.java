import java.io.*;
import java.util.*;

class Main
{
    public static void main (String[] args) throws Exception
    {
        BufferedReader bu=new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb=new StringBuilder();
        String s[]=bu.readLine().split(" ");
        int a=Integer.parseInt(s[0]),b=Integer.parseInt(s[1]),c=Integer.parseInt(s[2]);
        s=bu.readLine().split(" ");
        int d=Integer.parseInt(s[0]),e=Integer.parseInt(s[1]),f=Integer.parseInt(s[2]);
        int sum1=a+b+c,sum2=d+e+f;
        int sh1=sum1/5+((sum1%5==0)?0:1),sh2=sum2/10+((sum2%10==0)?0:1);
        int n=Integer.parseInt(bu.readLine());
        if(sh1+sh2<=n) sb.append("YES\n");
        else sb.append("NO\n");
        System.out.print(sb);
    }
}
