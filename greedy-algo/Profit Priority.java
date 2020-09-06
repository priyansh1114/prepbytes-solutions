import java.io.*;
import java.util.*;

class Main
{
    public static void main(String args[])throws Exception
    {
        BufferedReader bu=new BufferedReader(new InputStreamReader(System.in));
        int n=Integer.parseInt(bu.readLine());
        int i,a[][]=new int[n][2],t=0;
        for(i=0;i<n;i++)
        {
            String s[]=bu.readLine().split(" ");
            a[i][0]=Integer.parseInt(s[1]);
            a[i][1]=Integer.parseInt(s[2]);
            t=Math.max(t,a[i][0]);
        }
        Arrays.sort(a, new Comparator<int[]>() {
            @Override
            public int compare(int[] o1, int[] o2) {
                if(o1[1]<o2[1]) return 1;
                else if(o1[1]==o2[1]) return o1[0]>o2[0]?1:-1;
                else return -1;
            }
        });

        int d[]=new int[t+1],sum=0; boolean v[]=new boolean[t+1];
        for(i=0;i<n;i++)
        {
            for(int j=Math.min(t,a[i][0]);j>0;j--)
            if(!v[j])
            {
                v[j]=true;
                d[j]=i;
                break;
            }
        }

        for(i=1;i<=t;i++)
        sum+=a[d[i]][1];
        System.out.print(sum);
    }
}
