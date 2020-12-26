import java.io.*;
import java.util.*;

class Main
{
    public static void main(String args[])throws Exception
    {
        BufferedReader bu=new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb=new StringBuilder();
        int n=Integer.parseInt(bu.readLine());
        int i,N=1000007,a[]=new int[N];
        String s[]=bu.readLine().split(" ");
        int l=Integer.parseInt(s[0]),r=Integer.parseInt(s[1]);
        for(i=0;i<n-1;i++)
        {
            s=bu.readLine().split(" ");
            int x=Integer.parseInt(s[0]),y=Integer.parseInt(s[1]);
            a[x]++;
            a[y]--;
        }
        for(i=1;i<N;i++)
        a[i]+=a[i-1];
        int ans=0;
        for(i=l;i<r;i++)
        if(a[i]==0) ans++;
        System.out.print(ans);
    }
}
