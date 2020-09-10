#include<iostream>
#include<cmath>
using namespace std;
  //Type your code here.
  struct student
  {
    int rn;
    int s1,s2,s3,s4,s5,grade;
      double t;
    float avg;
  };
int main()
{
  int i,n;
     cout<<"STUDENT MARKSHEET USING STRUCTURES"<<endl;
  cout<<"Enter the no of students"<<endl;
  cout<<"rn s1 s2 s3 s4 s5 avg grade"<<endl;
  cin>>n;
  struct student s[n];
  for(i=0;i<n;i++)
  {
    cin>>s[i].rn>>s[i].s1>>s[i].s2>>s[i].s3>>s[i].s4>>s[i].s5;
   s[i].t=s[i].s1+s[i].s2+s[i].s3+s[i].s4+s[i].s5;
   s[i].avg=s[i].t/5.0;
              }
  for(i=0;i<n;i++)
  {
    if(s[i].avg>70)
    {
      s[i].grade=1;
    }
    else
    {
      s[i].grade=2;
    }
    cout<<s[i].rn<<" "<<s[i].s1<<" "<<s[i].s2<<" "<<s[i].s3<<" "<<s[i].s4<<" "<<s[i].s5<<" "<<floor(s[i].avg)<<" "<<s[i].grade;
      cout<<endl; 
}
  return 0;
}
    