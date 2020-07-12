#include<bits/stdc++.h>
using namespace std;
int main()
{
    int i,j;
    for(i=1;i<=5;i++)
    {
        for(j=5;j>i;j--)
            printf("  ");
        for(j=i;j<2*i;j++)
            printf("%d ",j);
        for(j=2*i-2;j>=i;j--)
            printf("%d ",j);
        printf("\n");
    }
    return 0;
}
