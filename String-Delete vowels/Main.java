#include <iostream>
#include <cstring>
using namespace std;
int check_vowel(char);
int main()
{
  //Type your code here.
 char p[100],q[100];
 int a,b=0;
 gets(p);
 for(a=0;p[a]!='\0';a++) 
 {
  if(check_vowel(p[a])==0) 
  {
   q[b]=p[a];
   b++;
   }
  }
  q[b]='\0';
strcpy(p,q); 
cout<<p;
  return 0;
}
int check_vowel(char ch)
{
if (ch=='a'||ch=='A'||ch=='e'||ch=='E'||ch=='i'||ch=='I'||
ch=='o'||ch=='O'||ch=='u'||ch=='U')
  return 1;
else
  return 0;
}

