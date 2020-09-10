#include<iostream>
#include<string.h>
using namespace std;
int main()
{
	//Type your code here.
  char str[100];
  int i;
  cin>>str;
 for(i=0 ;str[i]!='\0';i++)
{
  if(str[i]>='a' && str[i]<='z')
        {
            str[i] = str[i] - 32;
        }
        else if(str[i]>='A' && str[i]<='Z')
        {
            str[i] = str[i] + 32;
        }
}

          cout<<str;
  return 0;
}