#include<iostream>
using namespace std;
int main()	
{
  //Type your code here.
int n,range;
int min=0,max=0;
int arr[n];
cin>>n;
cout<<"Enter the number of elements in the array"<<endl;
cout<<"Enter the elements in the array"<<endl;
  for(int i=0;i<n;i++)
  {
cin>>arr[i];
  }
min=arr[0];
max=arr[0];
  for(int i=1;i<n;i++)
  {
    if(arr[i]<min)
    {
      min=arr[i];
    }
  }
  for(int i=1;i<n;i++)
  {
    if(arr[i]>max)
    {
max=arr[i];
    }
  }
  range=max-min;
cout<<"The range of the array is "<<range;
  return 0;
}


