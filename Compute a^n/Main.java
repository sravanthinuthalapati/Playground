#include<iostream>
using namespace std;
 int power(int a, int n); 
int main() {
  //Type your code here.
   int a,n;
  cin>>a>>n;
  cout<<"Enter the value of a"<<endl;
cout<<"Enter the value of n"<<endl;
   cout<<"The value of "<<a<<" power "<<n<<" is "<<power(a,n);
   return 0;
}
 int power(int a, int n) 
 {
   if(n == 0)
   return 1;
   else
   return(a*power(a, n-1));
}
