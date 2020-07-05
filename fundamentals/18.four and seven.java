import java.util.*;
import java.io.*;

public class Main {
  public static void main(String args[]) throws IOException {
    
    //write your code here
    BufferedReader bu=new BufferedReader(new InputStreamReader(System.in));
    int n=Integer.parseInt(bu.readLine());
    int i,j,m[]={4,7},c[]=new int[n+1],fs[][]=new int[n+1][2];
    for(i=1;i<=n;i++)
    c[i]=Integer.MAX_VALUE;
    
    for(i=1;i<=n;i++)
    for(j=0;j<2;j++)
    if(m[j]<=i)
    {
      int min=c[i-m[j]];
      if(min!=Integer.MAX_VALUE && min+1<c[i]) 
      {
        c[i]=min+1;
        fs[i][0]=fs[i-m[j]][0];
        fs[i][1]=fs[i-m[j]][1];
        fs[i][j]++;
      }
    }
    if(c[n]==Integer.MAX_VALUE) {System.out.print("-1"); return;}
    StringBuilder sb=new StringBuilder();
    for(i=0;i<fs[n][0];i++)
    sb.append(4);
    for(i=0;i<fs[n][1];i++)
    sb.append(7);
    System.out.print(sb);
  }
}
