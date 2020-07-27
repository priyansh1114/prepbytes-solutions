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
            String s=bu.readLine();
            int i,a=0,n=s.length();
            for(i=0;i<n;i++)
            if(s.charAt(i)=='a') a++;

            int l=Math.min(2*a-1,n);
            sb.append(l+"\n");
        }
        System.out.print(sb);
    }
}
