import java.io.*;
class Main
{
    public static void main(String args[])throws Exception
    {
        BufferedReader bu=new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb=new StringBuilder();
        int t=Integer.parseInt(bu.readLine());
        while(t-->0)
        {
            int n=Integer.parseInt(bu.readLine());
            String s[]=bu.readLine().split(" ");
            int i,a[]=new int[n];
            for(i=0;i<n;i++)
            a[i]=Integer.parseInt(s[i]);

            int k=Integer.parseInt(bu.readLine()),l=-1,r=-1;
            for(i=0;i<n;i++)
            {
                int p=binarys(a,i+1,n-1,k-a[i]);
                if(p!=-1) {l=i; r=p; break;}
            }
            if(l==-1) sb.append("no answer\n");
            else sb.append(l+" "+r+"\n");
        }
        System.out.print(sb);
    }

    static int binarys(int a[],int l,int r,int k)
    {
        int mid,ans=-1;
        while(l<=r)
        {
            mid=(l+r)/2;
            if(a[mid]>k) r=mid-1;
            else
            {
                if(a[mid]==k) ans=mid;
                l=mid+1;
            }
        }
        return ans;
    }
}

