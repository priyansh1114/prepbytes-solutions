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
            int a=Integer.parseInt(s[0]),b=Integer.parseInt(s[1]);
            if(a<b) a=a^b^(b=a);
            int te,c=0;
            while(b!=0)
            {
                te=b;
                c+=a/b;
                b=a%b;
                a=te;
            }
            sb.append(c+"\n");
        }
        System.out.print(sb);
    }
}
