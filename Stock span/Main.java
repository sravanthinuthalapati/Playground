#include<iostream>
using namespace std;
int main()
{	
//Type your code here.
int n,x=1,y=0,i;
cin>>n;
int a[n];
for(i=0;i<n;i++)
cin>>a[i];
cout<<x;
for(int i=1;i<n;i++)
{
if(a[i]<a[i-1])
cout<<"\n"<<x;
else
{
y=y+2;
cout<<"\n"<<y;
}
}
}
