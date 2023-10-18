#include<iostream>
using namespace std;
int main()
{
    int t;
    cin>>t;
    while(t--){
        int n;
        cin>>n;
       if(n==1)
       cout<<"YES";
       else if(n%2==0)
       cout<<"YES";
       else
       cout<<"NO";
       cout<<endl;
    }
    return 0;
}