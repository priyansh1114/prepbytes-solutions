import java.io.*;

class Main
{
    public static void main (String[] args) throws Exception
    {
        BufferedReader bu=new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb=new StringBuilder();
        int t=Integer.parseInt(bu.readLine());
        while(t-->0)
        {
            String s[]=bu.readLine().split(" ");
            int n=Integer.parseInt(s[0]),k=Integer.parseInt(s[1]),i,r=0,sum=0,a[]=new int[n];
            s=bu.readLine().split(" ");
            for(i=0;i<n;i++)
            a[i]=Integer.parseInt(s[i]);

            int ans=0;
            for(i=0;i<n;i++)
            {
                while(sum<k)
                {
                    if(r==n) break;
                    else sum+=a[r++];
                }
                if(sum<k) break;
                ans+=n-r+1;
                sum-=a[i];
            }
            sb.append(ans+"\n");
        }
        System.out.print(sb);
    }
}
