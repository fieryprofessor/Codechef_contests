#include<iostream>
using namespace std;

int main(){
int t;
cin>>t;
while(t--){
    int X,Y,Z;
    cin>>X>>Y>>Z;
    int mins=X*Y;
    int minutes_we_have=Z*24*60;
    if(mins<=minutes_we_have){
        cout<<"YES"<<endl;
    }
    else{
        cout<<"NO"<<endl;
    }
}
    return 0;
}