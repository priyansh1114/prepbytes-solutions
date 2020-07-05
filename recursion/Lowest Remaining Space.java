import java.io.*;

public class Main {
    public static void main(String args[]) throws IOException {

        //write your code here
        BufferedReader bu=new BufferedReader(new InputStreamReader(System.in));
        String s[]=bu.readLine().split(" ");
        int n=Integer.parseInt(s[0]); long h=Integer.parseInt(s[1]);
        int i,a[]=new int[n];
        //knapsack problem but due to high weight values, use subset sum

        s=bu.readLine().split(" "); long sum=0;
        for(i=0;i<n;i++)
            a[i]=Integer.parseInt(s[i]);

        int max=(int)Math.pow(2,n); long min=h;
        for(i=0;i<max;i++)
        {
            int ar[]=new int[32],x=0,v=i;
            while(v!=0)
            {
                if((v&1)==1) ar[x]++;
                x++;
                v>>=1;
            }
            sum=0;
            for(x=0;x<n;x++)
                if(ar[x]==1) sum+=a[x];

            if(sum<=h) min=Math.min(min,h-sum);
        }
        System.out.print(min);
    }
}

