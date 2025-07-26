#include <iostream>
#include <vector>
#include <algorithm>

using namespace std;

vector <pair <int,int> > v;

bool compare(const pair<int,int> &a, const pair<int,int> &b){
    return a.second < b.second;
}

int main() {
    int N, x, y, cnt=0, min;

    cin >> N;

    for(int i=0; i<N; i++){
        cin >> x >> y;
        v.push_back(pair<int,int>(x,y));
    }

    sort(v.begin(), v.end());
    sort(v.begin(), v.end(), compare);

    min = v[0].second;
    cnt++;

    for(int i=1; i<N; i++){
        if(min <= v[i].first){
            min = v[i].second;
            cnt++;
        }
    }

    cout << cnt << endl;

    return 0;
}