#include <iostream>
#include<math.h>
using namespace std;

int main() {
	int t;
    cin>>t;
    while(t--){
        int x,y;
        cin>>x>>y;
        int s=floor(x/y);
        if(s>=20){
            s= 20;
        }
        cout<<s<<endl;
    }
	return 0;
}
