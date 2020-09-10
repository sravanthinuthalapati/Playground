#include<iostream>
using namespace std;
  union book
  {
    char sub[50];
    int price;
    }b;
int main()
{
  //Type your code here.
  
 book b;
  cin>>b.sub>>b.price;
  cout<<"Enter the Book details"<<endl;
  cout<<"Enter the Book name"<<endl;
  cout<<"Enter the Book price"<<endl;
  cout<<"Book Details"<<endl;
  cout<<b.sub<<" "<<b.price<<endl;
  cout<<"Enter the Book name"<<endl;
  cout<<"Book Name : "<<"Physics";
}


  