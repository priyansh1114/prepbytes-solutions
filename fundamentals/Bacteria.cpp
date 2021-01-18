#include<bits/stdc++.h>
using namespace std;

int main()
{
    int n,m;
    cin>>n>>m;
    if(m%n!=0) cout<<"-1";
    else
    {
        n=m/n;
        int ans=0;
        while(n%2==0) {n/=2; ans++;}
        while(n%3==0) {n/=3; ans++;}
        if(n!=1) cout<<"-1";
        else cout<<ans;
    }
    return 0;
}
