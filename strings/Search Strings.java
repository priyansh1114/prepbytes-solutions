import java.util.*;
import java.io.*;

public class Main {
  public static void main(String args[]) throws IOException {
    
    //write your code here
    BufferedReader bu=new BufferedReader(new InputStreamReader(System.in));
    StringBuilder sb=new StringBuilder();
    char s[]=bu.readLine().toCharArray();
    int q=Integer.parseInt(bu.readLine());
    while(q-->0)
    {
      ArrayList<Integer> al=new ArrayList<>();
      char t[]=bu.readLine().toCharArray();
      int m=t.length,n=s.length,i,j,lps[]=new int[m];
      
      //compute lps array
      j=0; i=1;
      while(i<m)
      {
        if(t[i]==t[j]) lps[i++]=++j;
        else
        {
          if(j!=0) j=lps[j-1];
          else lps[i++]=j;
        }
      }
      
      //find number of patterns
      i=0;j=0;
      while(i<n)
      {
        if(t[j]==s[i]) {j++; i++;}
        if(j==m) {al.add(i-j); j=lps[j-1];}
        else if(i<n && t[j]!=s[i]) 
        {
          if(j!=0) j=lps[j-1];
          else i++;
        }
      }
      
      sb.append(al.size()+" ");
      for(i=0;i<al.size();i++)
      sb.append(al.get(i)+" ");
      sb.append("\n");
    }
    System.out.print(sb);
  }
}
