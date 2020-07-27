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
            char s[]=bu.readLine().toCharArray();
            int i,a=0,n=s.length,prev=0;
            for(i=0;i<n-3;i++)
            if(s[i]=='a' && s[i+1]=='m' && s[i+2]=='a' && s[i+3]=='n') {a+=(i+1-prev)*(n-(i+3)); prev=i+1;}
            sb.append(a+"\n");
        }
        System.out.print(sb);
    }
}
