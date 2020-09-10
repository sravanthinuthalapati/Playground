#include<iostream>
using namespace std;
int main()
{
  //Type your code here.
int arr[20], n, insert, i, pos;
cout<<"Enter the number of elements in the array"<<endl;
cin>>n;
cout<<"Enter the elements in the array"<<endl;
for(i=0; i<n; i++)
	{
		cin>>arr[i];
	}
cout<<"Enter the location where you wish to insert an element"<<endl;
cin>>pos;
   if(pos<=n)
   {
cout<<"Enter the value to insert"<<endl;
	cin>>insert;
cout<<"Array after insertion is"<<endl;
	for(i=n; i>pos-1; i--)
	{
		arr[i]=arr[i-1];
	}
	arr[pos-1]=insert;
	for(i=0; i<n+1; i++)
	{
		cout<<arr[i]<<endl;
	}
   }
  else
  {
cout<<"Invalid Input";
  }
}

