#include<bits/stdc++.h>
using namespace std;
int main()
{
    int t;
    scanf("%d",&t);
    while(t--)
    {
        int a,b,c,n,k;
        scanf("%d%d%d%d",&a,&b,&c,&n);
        n-=3;
        printf("%d %d %d ",a,b,c);
        while(n--)
        {
            k=a+b+c;
            printf("%d ",k);
            a=b;
            b=c;
            c=k;
        }
        printf("\n");
    }
}
