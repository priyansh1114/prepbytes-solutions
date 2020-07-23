import java.io.*;
import java.util.*;

class Main
{
    public static void main (String[] args) throws Exception
    {
        BufferedReader bu=new BufferedReader(new InputStreamReader(System.in));
        int n=Integer.parseInt(bu.readLine());
        int c=0;
        while(n>0)
        {
            if((n&1)==1) c++;
            n>>=1;
        }
        System.out.print(c);
    }
}
