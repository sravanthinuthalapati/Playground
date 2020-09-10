#include<iostream>
using namespace std;
int main()
{
 //Type your code here.
int r,c;
cin>>r>>c;
int i,j;
int m1[r][c],m2[r][c],m3[r][c];
for(i = 0;i<r;i++)
{
for(j=0;j<c;j++)
cin >> m1[i][j];
}
for(i=0;i<c;i++)
{
for(j=0; j<c; j++)
cin >> m2[i][j];
}

for(i=0;i<r;i++)
{
for(j=0;j<c;j++)
{
m3[i][j] = m1[i][j]+m2[i][j];
}
}
for(i=0; i<r; i++)
{
for(j=0;j<c;j++)
cout << m3[i][j] << " ";
cout << endl;
}
return 0;
}
