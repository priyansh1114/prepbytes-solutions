import java.io.*;
import java.util.*;

class Main
{
    public static void main (String[] args) throws Exception
    {
        BufferedReader bu=new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb=new StringBuilder();
        int t=Integer.parseInt(bu.readLine()),i,j,N=1000000;
        int p[]=new int[N+1];
        p[0]=p[1]=1;
        for(i=2;i<=N;i++)
        if(p[i]==0)
        for(j=2*i;j<=N;j+=i)
        p[j]=1;

        ArrayList<Integer> su=new ArrayList<>();
        for(i=2;i<=N;i++)
        if(p[i]==0)
        if(odd(i)) su.add(i);

        long s[]=new long[500],sum=0;
        for(i=0;i<500;i++)
        {
            sum+=su.get(i);
            s[i]=sum;
        }

        while(t-->0)
        {
            int n=Integer.parseInt(bu.readLine());
            n--;
            sb.append(s[n]+"\n");
        }
        System.out.print(sb);
    }

    static boolean odd(int n)
    {
        while(n!=0)
        {
            int d=n%10;
            if(d==3 || d==5 || d==7) return false;
            n/=10;
        }
        return true;
    }
}
