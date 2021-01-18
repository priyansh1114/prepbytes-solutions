import java.io.*;
import java.util.*;

class Main
{
    public static void main(String args[])throws Exception
    {
        BufferedReader bu=new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb=new StringBuilder();
        int t=Integer.parseInt(bu.readLine());
        int N=2000000,c[]=new int[N+1];
        while(t-->0)
        {
            int n=Integer.parseInt(bu.readLine());
            int i,a; long ans=0;
            String s[]=bu.readLine().split(" ");
            for(i=0;i<n;i++)
            {
                a=Integer.parseInt(s[i]);
                c[a]++;
            }
            PriorityQueue<Book> pq=new PriorityQueue<>(new Comparator<Book>() {
                @Override
                public int compare(Book o1, Book o2) {
                    if(o1.v<o2.v) return 1;
                    else return -1;
                }});
            for(i=1;i<=N;i++)
            if(c[i]>0)
            {
                pq.add(new Book(i,c[i]));
                c[i]=0;
            }

            while(pq.size()>1)
            {
                Book b1=pq.poll(),b2=pq.poll();
                ans+=b1.c;
                b2.c+=b1.c;
                pq.add(b2);
            }
            sb.append(ans+"\n");
        }
        System.out.print(sb);
    }

    static class Book
    {
        int c,v;
        Book(int a,int b)
        {
            v=a;
            c=b;
        }
    }
}
