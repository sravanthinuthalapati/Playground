#include<iostream>
using namespace std;
int main()
{
  //Type your code here.
int n,sum=0,p;
cout<<"Enter the number of elements in the array"<<endl;
cin>>n;
int arr[n];
cout<<"Enter the elements in the array"<<endl;
  for(int i=0;i<n;i++)
  {
cin>>arr[i];
  }
  for(int i=0;i<n;i++)
  {
    sum=sum+arr[i];
  }
  p=sum/n;
cout<<"The mean of the array is "<<p;

}
