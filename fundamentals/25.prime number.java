import java.util.*;
import java.io.*;

public class Main {
  public static void main(String args[]) throws IOException {
    
    //write your code here
    BufferedReader bu=new BufferedReader(new InputStreamReader(System.in));
    StringBuilder sb=new StringBuilder();
    int n=Integer.parseInt(bu.readLine());
    if(n<3) {System.out.print("-1"); return;}
    int p10=1,a=10,b=n-1,M=210,i;
    while(b!=0)
    {
      if(b%2==1) p10=(p10*a)%M;
      b>>=1;
      a=(a*a)%M;
    }
    p10=(M-p10)%M;
    String s=Integer.toString(p10);
    for(i=0;i<n-s.length();i++)
    if(i==0) sb.append(1);
    else sb.append(0);
    sb.append(s);
    System.out.print(sb);
  }
}
