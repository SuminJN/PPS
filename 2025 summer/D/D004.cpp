#include <iostream>
#include <list>
using namespace std;

int main(){
    int n;
    cin >> n;

    while(n--){
        string s;
        cin >> s;
        list<char> result;
        list<char>::iterator now = result.begin();

        for(int i=0; i<s.size(); i++){
            if(s[i] == '<'){
                if(now != result.begin()){
                    now--;
                }
            }
            else if(s[i] == '>'){
                if(now != result.end()){
                    now++;
                }
            }
            else if(s[i] == '-'){
                if(now != result.begin()){
                    now = result.erase(--now);
                }
            }else{
                result.insert(now, s[i]);
            }
        }
        for (list<char>::iterator it = result.begin(); it != result.end(); it++) {
            cout << *it;
        }
        cout << "\n";
    }

    return 0;
}
