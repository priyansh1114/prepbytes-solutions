import java.util.*;
import java.io.*;

public class Main {
  public static void main(String args[]) throws IOException {
    
    //write your code here
    BufferedReader bu=new BufferedReader(new InputStreamReader(System.in));
    int t=Integer.parseInt(bu.readLine());
    StringBuilder sb=new StringBuilder();
    while(t-->0)
    {
      String s[]=bu.readLine().split(" ");
      long b=Long.parseLong(s[0]),a=0; char c[]=s[1].toCharArray();
      int i=0;
      for(i=0;i<c.length;i++)
      a=(a*10+c[i]-'0')%b;
      long tm=0;
      while(b!=0)
      {
        tm=b;
        b=a%b;
        a=tm;
      }
      sb.append(a+"\n");
    }
    System.out.print(sb);
  }
}
