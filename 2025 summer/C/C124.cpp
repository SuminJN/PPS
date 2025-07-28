#include <iostream>
#include <stack>
using namespace std;

const int MAX = 1000001;

int N;
int arr[MAX];
int visited[MAX];
int result[MAX];
stack<pair<int,int> > st;

int main(){
    cin >> N;

    for(int i=0; i<N; i++){
        cin >> arr[i];
        visited[arr[i]]++;
    }

    for(int i=N-1; i>=0; i--){

        while(!st.empty() && st.top().first <= visited[arr[i]]){
            st.pop();
        }

        if(st.empty()){
            result[i] = -1;
        }else{
            result[i] = st.top().second;
        }

        st.push(make_pair(visited[arr[i]], arr[i]));
    }


    for(int i=0; i<N; i++){
        cout << result[i] << " ";
    }

    return 0;
}
