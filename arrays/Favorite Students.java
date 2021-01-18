import java.io.*;
import java.util.*;

class Main
{
    public static void main(String args[])throws Exception
    {
        BufferedReader bu=new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb=new StringBuilder();
        int n=Integer.parseInt(bu.readLine());
        n%=4;
        if(n==1 || n==0) sb.append("Yes\n");
        else sb.append("No\n");
        System.out.print(sb);
    }
}
