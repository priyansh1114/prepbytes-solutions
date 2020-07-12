#include<bits/stdc++.h>
using namespace std;
int main()
{
    int i,j;
    for(i=1;i<=5;i++)
    {
        for(j=1;j<=i;j++)
            printf("%d",j);
        for(j=0;j<10-2*i;j++)
            printf(" ");
        for(j=i;j>=1;j--)
            printf("%d",j);
        printf("\n");
    }
    return 0;
}
