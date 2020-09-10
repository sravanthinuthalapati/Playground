#include<iostream>
using namespace std;
int main()
{
  //Type your code here.
 int n,p,i,sum=0;
cin>>n;
cin>>p;
int arr[n];
 for(i=0;i<n;i++)
 {
cin>>arr[i];
 }
 for(i=0;i<n;i++)
 {
sum=sum+arr[i];
 }
 if(sum<=p)
 {
cout<<"YES";
 }
 else
 {
cout<<"NO";
 }
  return 0;
}

