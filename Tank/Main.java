#include<iostream>
using namespace std;
int main()
{
  //Type your code here.
  int r,h,a,t,vol,p;
  cin>>r>>h>>a>>t;
  vol=(22/7)*(r*r)*(h);
  p=a*t;
  if(vol<p)
  {
  cout<<"The tank can be filled within"<<" "<< t <<" "<<"hours";
  }
  else
  {
    cout<<"The tank cannot be filled within"<<" "<< t <<" "<<"hours";
  }
}