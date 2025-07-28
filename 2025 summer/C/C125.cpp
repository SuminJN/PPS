#include <iostream>

using namespace std;

int dp[31];

int fn(int n)
{
    if(n==0) return 1;
    if(n==1) return 0;
    if(n==2) return 3;
    if(dp[n]!=0) return dp[n];

    int result = 3*fn(n-2);
    for(int i=3; i<=n; i++){
        if(i%2==0)
            result += 2*fn(n-i);
    }
    return dp[n] = result;
}

int main()
{
    int n;
    cin >> n;

    cout << fn(n);

    return 0;
}
