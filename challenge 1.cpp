#include<bits/stdc++.h>
using namespace std;

/* fibonacci sequence function*/

int fib(int n){
	if (n <= 1)
    return n;
    return fib(n-1) + fib(n-2);
}


int main (){
    int n,f,count=1,k; // f is input number; count is index; k is a number in fibonacci sequence
    cout<<"Enter index n: "; // finding values according to the index
    cin>>n;
    cout <<n<<"th number in the fibonacci sequence is " <<fib(n);
    cout<<"\nEnter a number: "; 
    cin>>f;
	
	
/*
if value is equal to the number in the fib sequence, the index will be shown,
if the value is smaller than the number in the fib sequence, the closest index will be shown.
*/
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
			
