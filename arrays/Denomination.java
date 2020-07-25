import java.io.*;
import java.util.*;

class Main
{
    public static void main (String[] args) throws Exception
    {
        BufferedReader bu=new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb=new StringBuilder();
        int t=Integer.parseInt(bu.readLine()),a[]={1,2,5,10,20,50,100,500,1000};
        while(t-->0)
        {
            int n=Integer.parseInt(bu.readLine());
            int i,c=0;
            for(i=a.length-1;i>=0;i--)
            {
                c+=n/a[i];
                n%=a[i];
            }
            sb.append(c+"\n");
        }
        System.out.print(sb);
    }
}
