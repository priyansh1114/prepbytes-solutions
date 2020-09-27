import java.io.*;
import java.util.*;

class Main
{
    public static void main(String args[])throws Exception
    {
        BufferedReader bu=new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb=new StringBuilder();
        String s[]=bu.readLine().split(" ");
        int n=Integer.parseInt(s[0]),m=Integer.parseInt(s[1]);
        if(n>m) n=n^m^(m=n);
        int ans=1;
        if(n==1)
        {
            if(m<3) ans=0;
            else
            {
                ans=1;
                m-=3;
                ans+=m/4;
            }
        }
        else if(n==2) ans=0;
        System.out.print(ans);
    }
}
