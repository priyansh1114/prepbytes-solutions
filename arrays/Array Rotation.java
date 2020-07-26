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
            int n=Integer.parseInt(s[0]),k=Integer.parseInt(s[1]);
            k%=n;
            int i,a[]=new int[n];
            s=bu.readLine().split(" ");
            for(i=0;i<n;i++)
            a[i]=Integer.parseInt(s[i]);
            for(i=n-k;i<n;i++)
            sb.append(a[i]+" ");
            for(i=0;i<n-k;i++)
            sb.append(a[i]+" ");
            sb.append("\n");
        }
        System.out.print(sb);
    }
}
