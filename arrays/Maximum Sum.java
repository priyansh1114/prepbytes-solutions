import java.io.*;
import java.util.*;

class Main
{
    public static void main(String args[])throws Exception
    {
        BufferedReader bu=new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb=new StringBuilder();
        int t=Integer.parseInt(bu.readLine());
        while(t-->0)
        {
            String s[]=bu.readLine().split(" ");
            int n=Integer.parseInt(s[0]),k=Integer.parseInt(s[1]),i,a[]=new int[n];
            s=bu.readLine().split(" ");
            for(i=0;i<n;i++) a[i]=Integer.parseInt(s[i]);
            sb.append(kConcatenationMaxSum(a,k));
            sb.append("\n");
        }
        System.out.print(sb);
    }

    static long mod=1000000007;
    static int kConcatenationMaxSum(int[] ar, int k)
    {
        long kadanes=kadanesAlgo(ar);
        if(k==1) return (int)kadanes;
        long prefixSum= prefixSum(ar);
        long suffixSum=suffixSum(ar);
        long sum=0;
        for (int i1 : ar) sum += i1;
        if(sum>0) return (int)(Math.max(((sum*(k-2))%mod+suffixSum%mod+prefixSum%mod)%mod,kadanes%mod));
        else return (int)(Math.max((prefixSum%mod+suffixSum%mod)%mod,kadanes%mod));
    }

    static long kadanesAlgo(int[] ar)
    {
        long currentSum=0;
        long maxSum=Integer.MIN_VALUE;
        for(int i=0;i<ar.length;i++)
        {
            currentSum=currentSum>0?(currentSum+ar[i])%mod:ar[i];
            maxSum=Math.max(currentSum,maxSum);
        }
        return maxSum<0?0:maxSum%mod;
    }

    static long prefixSum(int[] ar)
    {
        long currentSum=0;
        long maxSum=Integer.MIN_VALUE;
        for(int i=0;i<ar.length;i++)
        {
            currentSum=(currentSum+ar[i])%mod;
            maxSum=Math.max(maxSum,currentSum);
        }
        return maxSum;
    }

    static long suffixSum(int[] ar)
    {
        long currentSum=0;
        long maxSum=Integer.MIN_VALUE;
        for(int i=ar.length-1;i>=0;i--){
            currentSum=(currentSum+ar[i])%mod;
            maxSum=Math.max(currentSum,maxSum);
        }
        return maxSum;
    }
}
