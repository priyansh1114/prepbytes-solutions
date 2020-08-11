import java.io.*;
class Main
{
    public static void main(String args[])throws Exception
    {
        BufferedReader bu=new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb=new StringBuilder();
        int n=Integer.parseInt(bu.readLine());
        int i,c,t,a=0;
        for(i=0;i<n;i++)
        {
            String s[]=bu.readLine().split(" ");
            t=Integer.parseInt(s[0]); c=Integer.parseInt(s[1]);
            if(c-t>=2) a++;
        }
        System.out.print(a);
    }
}
