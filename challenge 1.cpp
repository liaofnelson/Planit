#include<bits/stdc++.h>
using namespace std;

int fib(int n){
	if (n <= 1)
    return n;
    return fib(n-1) + fib(n-2);
}

int main (){
	int n,f,count=1,k;
    cout<<"Enter index n: ";
    cin>>n;
    cout <<n<<"th number in the fibonacci sequence is " <<fib(n);
    cout<<"\nEnter a number: ";
    cin>>f;
while(1){
	k=fib(count++);
	if(k==f){
	cout<<f<<" is a fibonacci number and index is "<<count-1;
break;
	}else if(k>f){
	cout<<f<<" is not a fibonacci number and the nearest index "<<count-2;
	break;
	}else{
	continue;
	}
}
return 0;
}
			
