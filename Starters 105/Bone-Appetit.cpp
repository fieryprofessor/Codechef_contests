#include<iostream>
using namespace std;
int main()
{
    int N,M;
    cin>>N>>M;
    int X,Y;
    cin>>X>>Y;
    int treats = (N*X)+(M*Y);
    cout<<treats;
    return 0;
}