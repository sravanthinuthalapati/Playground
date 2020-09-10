#include<iostream>
using namespace std;
int main()
{
 //Type your code here.
  int br,vs,as,a,l;
  cin>>br>>vs>>as>>a>>l;
  float t=(br*350.34)+(vs*230.90)+(as*190.55)+(a*125.30)+(l*180.90);
  if(t<15000)
  cout<<"Yes";
  else
  cout<<"No";
}
