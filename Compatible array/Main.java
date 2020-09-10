#include<iostream>
using namespace std;
int main()
{	
 //Type your code here.
int n,count=0,i;
cin>>n;
int a[2*(n+1)];
for(i=0;i<2*(n+1);i++)
{
cin>>a[i];
}
if(n!=(a[n]))
{
cout<<"Incompatible";
}
else
{

for(int i=0;i<n;i++)
{
if(a[i]>=a[n+i+1])
{
count++;
 }
 }
 if(count==n)
 {
cout<<"Compatible";
 }
 else
 {
cout<<"Incompatible";
 }
 }
}

