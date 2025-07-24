#include <iostream>
#include <vector>

using namespace std;
vector<bool> button(10, true);

int getSize(int N);
bool check(int N);

int main()
{
    int N, M, num, tmp;

    cin >> N >> M;

    for(int i=0; i<M; i++){
        cin >> num;
        button[num] = false;
    }

    int anw = abs(N - 100);

    for(int i=0; i<= 10000000; i++){
        if(check(i)){
            tmp = abs(N-i) + to_string(i).length();
            anw = min(anw, tmp);
        }
    }

    cout << anw;

    return 0;
}

int getSize(int N)
{
    int size=0;

    while(N){
        N /= 10;
        size++;
    }

    return size;
}

bool check(int N)
{
    string st = to_string(N);

    for(int i=0; i<st.length(); i++){
        if(button[st[i] - 48] == false)
            return false;
    }

    return true;
}
