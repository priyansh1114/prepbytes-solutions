import java.io.*;
import java.util.*;

class Main
{
    public static void main (String[] args) throws Exception
    {
        BufferedReader bu=new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb=new StringBuilder();
        int t=Integer.parseInt(bu.readLine());
        while(t-->0)
        {
            String s[]=bu.readLine().split(" ");
            int h=Integer.parseInt(s[0]),m=Integer.parseInt(s[1]);
            if(m==60) {m=0; h++;}
            if(h>=12) h-=12;
            double hr=0.5*(h*60+m),min=6.0*m;
            int angle=Math.abs((int)(hr-min));
            angle=Math.min(angle,360-angle);
            sb.append(angle+"\n");
        }
        System.out.print(sb);
    }
}
