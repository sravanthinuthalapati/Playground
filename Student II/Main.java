#include<iostream>
#include<stdio.h>
#include<string.h>
#include<stdlib.h>
using namespace std;
struct Student{
char name[30];
char department[20];
int yearOfStudy;
float cgpa;
};
void sortRecords(struct Student *s,int n)
{
struct Student temp;
int i,j;
for(i=0;i<n;i++)
{
for(j=0;j<n-i-1;j++)
{
if(strcmp(s[j].name,s[j+1].name)>0)
{
temp=s[j];
s[j]=s[j+1];
s[j+1]=temp;
}
}
}
}
void dispStudentDetails(struct Student s)
{
printf("Name : %s\n", s.name);
printf("Department : %s\n",s.department);
printf("Year of study : %d\n", s.yearOfStudy);
cout<<"CGPA : "<<s.cgpa<<endl;
}
void dispStudentNamesFromYear(struct Student * s, int year, int n){
printf("Students from Year %d\n", year);
int i;
for(i=0;i<n;i++)
{
if(s[i].yearOfStudy==year)
{
printf("%s\n", s[i].name);
}
}
}
void dispStudentNamesFromDept(struct Student * s, char * dept, int n){

printf("Students from Department %s\n", dept);
int i;
for(i=0;i<n;i++)
{
if(strcmp(s[i].department,dept)==0)
{
printf("%s\n",s[i].name);
}
}
}
void dispDeptTopperDetails(struct Student * s, char * dept, int n){
printf("%s Department Topper Details\n", dept);
float max=0.0f;
int pos,i;
for(i=0;i<n;i++)
{
if(strcmp(s[i].department,dept)==0)
{
if(max<s[i].cgpa)
{
pos=i;
max=s[i].cgpa;
}
}
}
dispStudentDetails(s[pos]);
}
void dispTopperDetails(struct Student * s, int n)
{
printf("Overall Topper Details\n");
float max=0.0f;
int pos;
int i;
for(i=0;i<n;i++)
{
if(max<s[i].cgpa)
{
pos=i;
max=s[i].cgpa;          
}
}
dispStudentDetails(s[pos]);
}
void updateCGPA(struct Student * s)
{
s->cgpa=s->cgpa+0.5;
}
void printMenu()
{
printf("Menu\n1)Display names of students from a particular year\n");
printf("2)Display names of students from a particular department\n");
printf("3)Display all details of the student having the highest CGPA\n");
printf("4)Display all details of the student from a particular department having the highest CGPA\n");
printf("5)Display all details of a particular student (Search by name)\n");
printf("6)Display all details of all students\n");
printf("7)Update CGPA of a particular student\n");
printf("8)Exit\n");
}
int main()
{
  int n,i,choice;
  struct Student c[100];
   printf("Enter the number of students\n");
  scanf("%d",&n);
  for(i=0;i<n;i++)
  {
    printf("Enter the details of student %d\n",i+1);
    printf("Enter name\n");
    scanf("%s",c[i].name);
    printf("Enter department\n");
    scanf("%s",c[i].department);
    printf("Enter year of study\n");
    scanf("%d",&c[i].yearOfStudy);
    printf("Enter cgpa\n");
    scanf("%f",&c[i].cgpa);
  }

    int year;
    char dept[100];
    char nameSearch[100];
    int flag=0;
    sortRecords(c,n);
do {
  printMenu();
  flag=0;
  printf("Enter your choice\n");
  scanf("%d",&choice);
  switch(choice) {
    case 1:
     printf("Enter the year\n");
     scanf("%d",&year);
     dispStudentNamesFromYear(c,year,n);
     break;
    case 2:
     printf("Enter the department\n");
     scanf("%s",dept);
     dispStudentNamesFromDept(c,dept,n);
     break;
    case 3:
     dispTopperDetails(c,n);
     break;
    case 4:
     printf("Enter the department\n");
     scanf("%s",dept);
     dispDeptTopperDetails(c,dept,n);
     break;
    case 5:
     printf("Enter the name\n");
     scanf("%s",nameSearch);
     for(i=0;i<n;i++)
{
if(strcmp(nameSearch,c[i].name)==0)
{
flag=1;
dispStudentDetails(c[i]);
break;
}
}
if(flag==0)
printf("Student by name %s not found\n", nameSearch);
break;
case 6:
for(i=0;i<n;i++)
{
dispStudentDetails(c[i]);
}
break;
case 7:
printf("Enter the name\n");
scanf("%s",nameSearch);
for(i=0;i<n;i++)
{
if(strcmp(c[i].name,nameSearch)==0)
{
updateCGPA(&c[i]);
break;
}
}
break;
default:
exit(0);
}
}
while(1);
return 0;
}