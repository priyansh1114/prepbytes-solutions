import java.io.*;
import java.util.*;
class Main
{
    public static void main(String args[])throws Exception
    {
        BufferedReader bu=new BufferedReader(new InputStreamReader(System.in));
        String s[]=bu.readLine().split(" ");
        int n=Integer.parseInt(s[0]),k=Integer.parseInt(s[1]),i,a[]=new int[n];
        long sum=0;
        s=bu.readLine().split(" ");
        for(i=0;i<n;i++)
        a[i]=Integer.parseInt(s[i]);
        Arrays.sort(a);
        for(i=n-1;i>=0;i--)
        {
            if(k==0) break;
            sum+=a[i];
            k--;
        }
        System.out.print(sum);
    }
}
