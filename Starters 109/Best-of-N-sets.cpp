#include<iostream>
using namespace std;
int main()
{
    int t;
    cin>>t;
    while(t--){
        int x,y;
        cin>>x>>y;
        int N;
        if(x>y){
             N=(x*2)-1;
        }
        else{
             N=(y*2)-1;
        }
        cout<<N<<endl;
    }
    return 0;
}