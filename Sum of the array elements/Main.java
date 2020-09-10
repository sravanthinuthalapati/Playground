#include<iostream>
using namespace std;
int findSum(int a[],int n);
int main()
{
  //Type your code here.
  int n;
cin>>n;
  int a[10];
for(int i=0;i<n;i++)
cin>>a[i];
cout<<findSum(a,n);
}
int findSum(int a[],int n)
{
  if(n<=0)
    return 0;
  return (findSum(a,n-1)+a[n-1]);
}
