import java.io.*;

public class Main
{
    public static void main(String args[])throws Exception
    {
        BufferedReader bu=new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb=new StringBuilder();
        int t=Integer.parseInt(bu.readLine());
        while(t-->0)
        {
            String s=bu.readLine();
            int i,a=0,n=s.length();
            for(i=0;i<n/2;i++)
            {
                int d=Math.abs(s.charAt(i)-s.charAt(n-i-1));
                a+=d;
            }
            sb.append(a+"\n");
        }
        System.out.print(sb);
    }
}
