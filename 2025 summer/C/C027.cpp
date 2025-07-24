#include <iostream>

using namespace std;

int main()
{
    int flag=0, x=0;
    int E, S, M;
    cin >> E >> S >> M;

    if(E == 15) E = 0;
    if(S == 28) S = 0;
    if(M == 19) M = 0;

    while(1){
        flag=0;
        x++;

        if(x % 15 == E)
            flag++;

        if(x % 28 == S)
            flag++;

        if(x % 19 == M)
            flag++;

        if(flag == 3) break;
    }

    cout << x;

    return 0;
}
