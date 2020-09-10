#include<iostream>
using namespace std;
union employee{
  char name[100];
  int salary;
}e;
int main()
{
  employee e;
    //Type your code here.
  cin>>e.name>>e.salary;
    cout<<"Enter the Employee details"<<endl;
    cout<<"Enter the Employee name :"<<endl;
  cout<<"Enter the Employee salary :"<<endl;
  cout<<"Employee Details"<<endl;
  cout<<e.name<<" "<<e.salary;
  
  

  }

  