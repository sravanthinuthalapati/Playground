#include<iostream>
#include<string.h>
using namespace std;
  struct employee
  {
  char name[50];
  char designation[100];
  int id;
  int age;
  double salary;
  };
  int main()
{
  //Type your code here.
    employee e;
    cin>>e.name;
    cin>>e.id;
    cin>>e.age;
    cin>>e.designation;
    cin>>e.salary;
    cout<<"Enter name:"<<endl;
    cout<<"Enter ID:"<<endl;
    cout<<"Enter age:"<<endl;
    cout<<"Enter designation: "<<endl;
    cout<<"Enter Salary: "<<endl;
    cout<<"Employee Details"<<endl;
    cout<<"Name of the Employee : "<<e.name<<endl;
    cout<<"ID of the Employee : "<<e.id<<endl;
    cout<<"Age of the Employee : "<<e.age<<endl;
    cout<<"Designation of the Employee : "<<e.designation<<endl;
    cout<<"Salary of the Employee : "<<e.salary;
    return 0;
  }
    
     

    
    
    
