#include<iostream>
using namespace std;
int sod(int n)
{
int sum=0;
while(n!=0)
{
sum=sum+n%10;
n=n/10;
}
return sum;
}
int main()
{
int n;
 cin>>n;
cout<<"Enter the value of n"<<endl;
 cout<<"The sum of digits in "<<n<<" is "<<sod(n);
return 0;
}