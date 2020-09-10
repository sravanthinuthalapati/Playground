#include<iostream>
#include<cmath>
using namespace std;
int main()
{
  //Type your code here.
  int x1,y1,r1,x2,y2,r2,a,b,p,q,k;
cin>>x1>>y1>>r1>>x2>>y2>>r2;
  a=x1-x2;
  b=y1-y2;
p=(a*a)+(b*b);
  q=sqrt(p);
  k=r1+r2;
  if(q==k)
  {
cout<<"Tangential";
  }
  else if(q<k)
  {
cout<<"Overlap";
  }
  else
  {
cout<<"Do not Overlap";
  }
}

