#include<iostream>
using namespace std;
int main()
{
  //Type your code here.
int arr1[10], arr2[10], n, i, j, k = 0;
cin>>n;
    for (i = 0; i< n; i++)
cin>>arr1[i];    
 for (i = 0; i< n; i++)
{	
 for (j = 0; j < k; j++)
 {
 if (arr1[i]==arr2[j])
 break;
 }
 if (j == k)
 {
arr2[k] = arr1[i];
 k++;
 }
 }
 for (i = 0; i< k; i++)
cout<< arr2[i] <<endl;
 return 0;
}

