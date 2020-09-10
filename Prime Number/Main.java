#include<iostream>
using namespace std;
bool prime(int n);
int main()
{
  //Type your code here.
   int n;
   bool flag;
   cin>>n;
   flag=prime(n);
   if (flag==true)
      cout<<"Prime Number";
   else
      cout<<"Not a Prime Number";
   return 0;
}
bool prime(int n){
    bool flag=true;
    if(n%2==0) 
     {
      flag = false;
     }
     return flag;
}