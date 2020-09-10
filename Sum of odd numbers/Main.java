
#include<iostream>
using namespace std;
void SumOfEven(int a[],int num,int sum);
int main()
{
  int i,a[100],num,sum=0;
cout<<"Enter the number of elements in the array\n";
cin>>num;
cout<<"Enter the elements in the array"<<endl;
   for(i=0;i<num;i++)
   {
cin>>a[i];
    }
SumOfEven(a,num-1,sum); 
}

void SumOfEven(int a[],int num,int sum)
{

 if(num>=0)
 {
  if((a[num])%2!=0)
  {
   sum+=(a[num]); 
  }
SumOfEven(a,num-1,sum);
 }
 else
 {
cout<<"The sum of the odd elements in the array is "<<sum; 
  return;
 }
}
