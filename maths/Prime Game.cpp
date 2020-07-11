#include<bits/stdc++.h>
using namespace std;
typedef long long ll;
int main()
{
    ll x,y;
    scanf("%lld%lld",&x,&y);
    string ans="";
    if(x-y==1) ans="NO";
    else ans="YES";
    cout<<ans;
    return 0;
}
