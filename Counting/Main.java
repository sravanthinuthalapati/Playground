#include<iostream>
#include<string.h>
using namespace std;
int main()
{
  //Type your code here.
char str[200];
 int vowels=0, consonants=0, digits=0, spaces=0,symbols=0,i;
  gets(str);
 for(i = 0; str[i]!= '\0'; i++)
    {
  if(str[i]=='a' || str[i]=='e' || str[i]=='i' || str[i]=='o' || str[i]=='u' || str[i]=='A' || str[i]=='E' || str[i]=='I' || str[i]=='O' || str[i]=='U')
        {
        vowels++;
        }
  else if((str[i]>='a' && str[i]<='z') || (str[i]>='A' && str[i]<='Z'))
        {
            consonants++;
        }
   else if (str[i]==' ')
        {
            spaces++;
        }
 else if(str[i]>='0' && str[i]<='9')
        {
            digits++;
        }
   else
   {
     symbols++;
   }
  }
 
  cout << "Vowels:" << vowels << endl;
  cout << "Consonants:" << consonants << endl;
 
  cout << "White Spaces:" << spaces << endl;
   cout << "Digits:" << digits << endl;
  cout<<"Symbols:"<<symbols;
 return 0;
}
