#include<iostream>
using namespace std;
int main()
{
  //Type your code here.
   int r,c,num,c2,c3,c4,c5,r2;
std::cin>>r>>c>>num;
  c2=c*2;
  c3=c*3;
  c4=c*4;
  c5=c*5;
  r2=r*2;
  if(num>1&&num<=c)
std::cout<<"Yes";
  else if(num==c||num==c2||num==c3||num==c4||num==c5)
std::cout<<"No";
  else if(num==(c+1)||num==(c2+1)||num==(c3+1)||num==(c4+1)||num==(c5+1))
std::cout<<"No";
  else
std::cout<<"Yes";
}


