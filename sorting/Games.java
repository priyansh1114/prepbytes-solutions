import java.io.*;
import java.util.*;

class Main
{
    public static void main(String args[])throws Exception
    {
        BufferedReader bu=new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb=new StringBuilder();
        String s[]=bu.readLine().split(" ");
        int n=Integer.parseInt(s[0]),k=Integer.parseInt(s[1]),a[]=new int[n],i;
        int l=0,r=k,ans=0;
        s=bu.readLine().split(" ");
        for(i=0;i<n;i++)
        {
            a[i]=Integer.parseInt(s[i]);
            r=Math.min(r,a[i]);
        }
        Arrays.sort(a);
        while(l<=r)
        {
            int mid=(l+r)/2;
            if(possible(a,k,mid)) {ans=mid; l=mid+1;}
            else r=mid-1;
        }
        System.out.print(ans);
    }

    static boolean possible(int a[],int k,int mid)
    {
        int i,n=a.length,prev=0; boolean p=true;
        for(i=0;i<n;i++)
        {
            int cur=prev+mid;
            if(cur<a[i]) cur=a[i];
            if(cur>k) {p=false; break;}
            prev=cur;
        }
        return p;
    }
}
