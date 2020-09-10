#include<iostream>
#include<string.h>

using namespace std;
int main()
{
  //Type your code here.
char str[100];
  string temp="";
  int i,sum=0;
  cin>>str;
  for (i=0; str[i]!='\0';i++)
    {
        if(isdigit(str[i])) 
            temp += str[i];  
       else{
         
          sum=sum+atoi(temp.c_str());
           temp="";

       }
    }
  cout<<sum+atoi(temp.c_str());
}
  