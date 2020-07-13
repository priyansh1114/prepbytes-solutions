import java.io.*;
import java.util.*;

class Main
{
    public static void main (String[] args) throws Exception
    {
        BufferedReader bu=new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb=new StringBuilder();
        String s[]=bu.readLine().split(" ");
        int a=Integer.parseInt(s[0]),t=Integer.parseInt(s[1]);
        double am=a,amt=a/12.0,dp=0.25*t,r=Double.parseDouble(s[2]),rai=Double.parseDouble(s[3]),v=0;
        int m=0;
        while(v<dp)
        {
            v+=v*0.04/12+r*amt;
            m++;
            if(m%6==0)
            {
                am+=am*rai;
                amt=am/12;
            }
        }
        System.out.print(m);
    }
}
