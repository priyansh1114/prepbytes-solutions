#include <bits/stdc++.h>
using namespace std;

int main()
{
  //write your code here
  int t;
  scanf("%d",&t);
  while(t--)
  {
    long long int l,r,mx=0;
    scanf("%lld%lld",&l,&r);
    if(l==r) mx=l;
    else if(r-l==1) mx=r&l;
    else mx=max(r&(r-1),(r-1)&(r-2));
    printf("%lld\n",mx);
  }
  return 0;
}
