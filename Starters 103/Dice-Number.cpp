#include <iostream>
using namespace std;

void SelectionSort (int arr[] ,int n){
    for(int i=0;i<n-1;i++){
        int min_index=i;
        for(int j=i+1;j<n;j++){
            if(arr[j]<arr[min_index]){
                min_index = j;
            }
        }
        if(min_index !=i){
            swap(arr[i],arr[min_index]);
        }
    }
}

int main() {
	int t;
    cin>>t;
    while(t--){
        int a[3], b[3];
        for(int i=0;i<3;i++){
            cin>>a[i];
        }
        for(int i=0;i<3;i++){
            cin>>b[i];
        }
        SelectionSort(a,3);
        SelectionSort(b,3);
        int r=0; int n1,n2;
        for(int i=2;i>=0;i--){
          r=r*10+a[i];
        }
        n1=r;
        r=0;
        for(int i=2;i>=0;i--){
          r=r*10+b[i];
        }
        n2=r;
if(n1>n2){
    cout<<"Alice"<<endl;
}
else if(n2>n1){
    cout<<"Bob"<<endl;
}
else{
    cout<<"Tie"<<endl;
}
    }
	return 0;
}
