import java.io.*;
import java.util.*;

class Main
{
    public static void main(String args[])throws Exception
    {
        BufferedReader bu=new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb=new StringBuilder();
        int n=Integer.parseInt(bu.readLine().trim());
        String s[]=bu.readLine().trim().split(" ");
        int a[]=new int[n],x=0,i,ans[]=new int[2];
        for(i=0;i<n;i++)
        {
            a[i]=Integer.parseInt(s[i]);
            x^=a[i];
        }
        x&=-x;

        for(i=0;i<n;i++)
        if((x&a[i])==0) ans[0]^=a[i];
        else ans[1]^=a[i];
        Arrays.sort(ans);
        System.out.println(ans[0]+" "+ans[1]);
    }
}
