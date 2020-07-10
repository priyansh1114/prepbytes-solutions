#include<bits/stdc++.h>
using namespace std;
int main()
{
    int t;
    scanf("%d",&t);
    while(t--)
    {
        int n,c=0;
        scanf("%d",&n);
        if(n%10==0) c=0;
        else if(n%5==0) c=1;
        else c=-1;
        printf("%d\n",c);
    }
}
