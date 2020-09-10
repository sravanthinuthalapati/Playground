#include<iostream>
using namespace std;
int main()
{
  //Type your code here.
  int m,n,a,b,p,q,x,y;
cin>>m>>n;
for(int i=m;i<=n;i++)
  {
    a=i;
    b=a/10;
    p=a%10;
    q=b+p;
    x=b*p;
    y=q+x;
    if(i==y)
cout<<i<<endl;
  }
}

