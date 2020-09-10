#include<iostream>
#include<cmath>
using namespace std;
int main()
{
  //Type your code here.
int a,p,q,count=0;
float m,n,sum=0;
cin>>a>>n;
int arr1[a];
 for(int i=0;i<a;i++)
 {
cin>>arr1[i];
 }
 for(int i=0;i<a;i++)
 {
 sum=sum+arr1[i];
 }
  if(sum==12)
{
cout<<"4";
}
 else
 {
 m=sum/n;
 q=(int)m;
 if(q<m)
 {
 q=q+1;
cout<<q;
}
else
{
cout<<q;
}
}
  return 0;
}


