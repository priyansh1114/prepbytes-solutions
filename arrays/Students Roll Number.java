import java.util.*;
import java.io.*;

public class Main {
  public static void main(String args[]) throws IOException {
    
    BufferedReader bu=new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb=new StringBuilder();
        int t=Integer.parseInt(bu.readLine());
        
        int i;
        
        for(i=0;i<t;i++)
        {
            int n=Integer.parseInt(bu.readLine());
            String s[]=bu.readLine().split(" ");
            int c=0;
            for(int j=0;j<n && c<n;j++){
              System.out.print(Integer.parseInt(s[c])+" ");
              c+=2;
          }
          System.out.println();
        }
        
    
  }
}
