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
            int n=Integer.parseInt(s[0]),p=s[1].charAt(0);
            boolean ans=true;
            if((n%2==1 && p=='A') || (n%2==0 && p=='F')) ans=false;
            if(ans) sb.append("Himanshu\n");
            else sb.append("Friend\n");
        }
        System.out.print(sb);
    }
}
