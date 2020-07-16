import java.io.*;

class Main
{
    public static void main (String[] args) throws Exception
    {
        BufferedReader bu=new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb=new StringBuilder();
        int t=Integer.parseInt(bu.readLine());
        while(t-->0)
        {
            char s[]=bu.readLine().toCharArray();
            int i,n=s.length;
            for(i=n-2;i>=0;i--)
            if(s[i]<s[i+1]) break;
            if(i==-1) {sb.append(new String(s)+"\n"); continue;}
            char min='a';
            int c[]=new int[10],j=0,k=i;
            for(i=k+1;i<n;i++)
            if(s[i]>s[k])
                if(s[i]<min) {min=s[i]; j=i;}
            min=s[j];
            s[j]=s[k];
            s[k]=min;
            k++;
            for(i=k;i<n;i++)
            c[s[i]-'0']++;

            for(i=0;i<10;i++)
            while(c[i]>0)
            {
                c[i]--;
                s[k++]=(char)('0'+i);
            }
            sb.append(new String(s)+"\n");
        }
        System.out.print(sb);
    }
}
