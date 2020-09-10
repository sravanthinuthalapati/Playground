#include<iostream>
using namespace std;
int main()
{
  //Type your code here.
int a,b,count=0;
cin>>a>>b;
int arr1[a],arr2[b];
 for(int i=0;i<a;i++)
 {
cin>>arr1[i];
 }
 for(int i=0;i<b;i++)
 {
cin>>arr2[i];
 }
  if(a==b)
 {
 for(int i=0;i<a;i++)
 {
 if(arr1[i]==arr2[i])
  {
  count++;
 }
 }
 if(count==a)
 {
cout<<"Same";
 }
  else
 {
cout<<"Not Same";
 }
 }
  else
 {
cout<<"Not Same";
}
}

