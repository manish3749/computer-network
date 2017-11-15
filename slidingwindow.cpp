#include<bits/stdc++.h>
using namespace std;

int main()
{
    cout<<"Enter the frame size\n";
    int fsize=0,n;
    cin>>fsize;
    cout<<"Enter the no of frames\n";
    cin>>n;
    int frames[n];
    cout<<"enter"<<" "<<n<<" frames\n";
    for(int i=0;i<n;i++) cin>>frames[i];

    for(int i=0;i<n;i++){
        if(i%fsize==0) cout<<endl<<frames[i]<<" ";
        else cout<<frames[i]<<" ";
    }
}
