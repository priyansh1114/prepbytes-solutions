import java.io.*;

class Main {
    public static void main(String args[]) throws Exception {

        //write your code here
        BufferedReader bu=new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb=new StringBuilder();
        int t=Integer.parseInt(bu.readLine());
        int m[]=new int[10],i;
        m[0]=9;
        for(i=1;i<10;i++)
        m[i]=m[i-1]*10;

        while(t-->0)
        {
            int n=Integer.parseInt(bu.readLine());
            long ans=0; int sum=0,x=0;
            while(true)
            {
                if(sum+m[x]<=n)
                {
                    ans+=1l*(x+1)*m[x];
                    sum+=m[x];
                    x++;
                }
                else break;
            }
            ans+=1l*(x+1)*(n-sum);
            sb.append(ans+"\n");
        }
        System.out.print(sb);
    }
}
