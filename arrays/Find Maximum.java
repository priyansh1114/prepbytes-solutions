import java.io.*;

class Main
{
    public static void main (String[] args) throws Exception
    {
        BufferedReader bu=new BufferedReader(new InputStreamReader(System.in));
        int n=Integer.parseInt(bu.readLine());
        int a[]=new int[n],max[]=new int[n],min[]=new int[n],i,j;
        String s[]=bu.readLine().split(" ");
        int m=Integer.MAX_VALUE;
        for(i=0;i<n;i++)
        {
            a[i]=Integer.parseInt(s[i]);
            m=Math.min(m,a[i]);
            min[i]=m;
        }
        m=Integer.MIN_VALUE;
        for(i=n-1;i>=0;i--)
        {
            m=Math.max(m,a[i]);
            max[i]=m;
        }
        i=0;j=0;
        m=-1;
        while(i<n && j<n)
        {
            if(min[i]<max[j])
            {
                m=Math.max(m,j-i);
                j++;
            }
            else i++;
        }
        System.out.print(m);
    }
}
