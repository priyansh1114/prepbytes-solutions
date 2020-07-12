import java.io.*;
import java.util.*;

class Main
{
    public static void main (String[] args) throws Exception
    {
        BufferedReader bu=new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb=new StringBuilder();
        int n=Integer.parseInt(bu.readLine());
        int no=0;
        while(n!=0)
        {
            no=(10*no)+n%10;
            n/=10;
        }
        System.out.print(no);
    }
}
