import java.io.*;
import java.util.*;

class Main
{
    public static void main(String args[])throws Exception
    {
        BufferedReader bu=new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb=new StringBuilder();
        int t=Integer.parseInt(bu.readLine()),p[]={2,3,5,7,11,13,17,19,23,29,31,37,41,43,47,53,59},m=1<<17;
        int i,j;
        Pair a[]=new Pair[m-1];
        for(i=1;i<m;i++)
        {
            a[i-1]=new Pair(1,0);
            for(j=0;j<17;j++)
            if(((i>>j)&1)==1)
            {
                a[i-1].c++;
                a[i-1].v*=p[j];
            }
        }

        Arrays.sort(a, new Comparator<Pair>() {
            @Override
            public int compare(Pair o1, Pair o2) {
                if(o1.v>o2.v) return 1;
                else return -1;
            }});

        while(t-->0)
        {
            long n=Long.parseLong(bu.readLine()),ans=0;
            for(i=0;i<m-1;i++)
            {
                if(a[i].v>n) break;
                if(a[i].c%2==1) ans+=n/a[i].v;
                else ans-=n/a[i].v;
            }
            sb.append(ans+"\n");
        }
        System.out.print(sb);
    }

    static class Pair
    {
        long v; int c;
        Pair(long a,int b)
        {
            v=a;
            c=b;
        }
    }
}
