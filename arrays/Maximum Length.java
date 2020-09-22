import java.io.*;
import java.util.*;

class Main
{
    public static void main(String args[])throws Exception
    {
        BufferedReader bu=new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb=new StringBuilder();
        int n=Integer.parseInt(bu.readLine().trim()),a[]=new int[n],l=1,max=0,i;
        String s[]=bu.readLine().split(" ");
        for(i=0;i<n;i++)
        a[i]=Integer.parseInt(s[i]);

        for(i=1;i<n;i++)
        if(a[i]>a[i-1]) l++;
        else
        {
            max=Math.max(max,l);
            l=1;
        }
        max=Math.max(max,l);
        System.out.print(max);
    }
}
