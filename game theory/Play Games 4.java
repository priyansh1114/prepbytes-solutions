import java.io.*;
class Main
{
    public static void main(String args[])throws Exception
    {
        BufferedReader bu=new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb=new StringBuilder();
        int t=Integer.parseInt(bu.readLine().trim());
        while(t-->0)
        {
            int n=Integer.parseInt(bu.readLine().trim());
            String s[]=bu.readLine().split(" ");
            int i,x=0,k;
            for(i=0;i<n;i++)
            {
                k=Integer.parseInt(s[i]);
                x^=k;
            }
            if(x!=0) sb.append("Arnab\n");
            else sb.append("Friend\n");
        }
        System.out.print(sb);
    }
}
