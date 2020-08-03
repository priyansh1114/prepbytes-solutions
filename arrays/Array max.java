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
            String s[]=bu.readLine().split(" ");
            int n=Integer.parseInt(s[0]),k=Integer.parseInt(s[1]),i,j,max=0,a[]=new int[n];
            s=bu.readLine().split(" ");
            for(i=0;i<n;i++)
                a[i]=Integer.parseInt(s[i]);

            for(i=0;i<k;i++)
            {
                int cur=0;
                for(j=i;j<n;j+=k)
                {
                    cur=Math.max(a[j],cur+a[j]);
                    max=Math.max(max,cur);
                }
            }
            sb.append(max+"\n");
        }
        System.out.print(sb);
    }
}

