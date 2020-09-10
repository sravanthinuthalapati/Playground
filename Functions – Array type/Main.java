#include<iostream>
using namespace std;
int main()
{
  //Type your code here.
int n,i;
cin>>n;
  int a[n];
cout<<"Enter the number of elements in the array"<<endl;
  for(i=0;i<=n;i++)
{
cin>>a[i];
}
cout<<"Enter the elements in the array"<<endl;
int odd=0,even=0;
for(i=0;i<n;i++)
{
if(a[i]%2==1)
 odd++;
if(a[i]%2==0)
even++;
  }
if(odd==n)
cout<<"The array is Odd";
 else if(even==n)
cout<<"The array is Even";
else
cout<<"The array is Mixed";
}
