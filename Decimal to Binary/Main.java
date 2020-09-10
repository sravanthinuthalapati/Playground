#include<iostream>
using namespace std;
int find(int d);
 int main()
{
  //Type your code here.
  int d;
cin>>d;
cout<<find(d);
  return 0;
}
int find(int d)
{
  if(d==0)
    return 0;
  else
    return (d%2+10*find(d/2));
}
   

