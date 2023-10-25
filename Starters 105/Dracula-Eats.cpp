#include<iostream>
#include<math.h>
using namespace std;
int main()
{
    int T;
    cin>>T;
    while(T--){
        int N;
        cin>>N;
        
        if(N==0 || N==1)
        cout<<"0"<<endl;
        if(N==2)
        cout<<"1"<<endl;
        if(N>2){
            N=N-2;
            int days=floor(N/7);
            days++;
            cout<<days<<endl;
        }
    }
    return 0;
}