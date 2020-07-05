import java.util.*;
import java.io.*;

public class Main {
  public static void main(String args[]) throws IOException {
    
    //write your code here
    BufferedReader bu=new BufferedReader(new InputStreamReader(System.in));
    StringBuilder sb=new StringBuilder();
    int t=Integer.parseInt(bu.readLine());
    while(t-->0)
    {
      String s[]=bu.readLine().split(" ");
      int l=Integer.parseInt(s[0]),r=Integer.parseInt(s[1]);
      if(l==r) sb.append(l+"\n");
      else sb.append("1\n");
    }
    System.out.print(sb);
  }
}
