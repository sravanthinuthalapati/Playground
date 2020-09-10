#include<iostream>
using namespace std;
int digits(int num);
int main()
{
  int num;
  int p;
   cin>>num;
   p=digits(num);
  cout<<"Enter the value of n"<<endl;
   cout<<"The number of digits in "<<num<<" is "<<p;
    return 0;
}
int digits(int num)
{
   static int count=0;
     if(num>0)
    {
      count++;
     digits(num/10);
    }
    else
    {
     return count;
    }
}
 
 
