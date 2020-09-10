#include <iostream>
using namespace std;
#define MAX_SIZE 100
int Findmaxnumber(int array[], int index, int len);
int Findminnumber(int array[], int index, int len);
int main()
{
int array[MAX_SIZE], Num, max;
int i;
cout<<"Enter the size of the array"<<endl;
cin>>Num;
cout<<"Enter " <<Num<<" elements of an array"<<endl;
for(i=0; i<Num; i++)
    {
cin>>array[i];
    }
    max = Findmaxnumber(array, 0, Num);
cout<<"Maximum element in the array is "<<max<<endl;
    return 0;
}
int Findmaxnumber(int array[], int index, int len)
{
    int max;
if(index >= len-2)
    {
      if(array[index] >array[index + 1])
       return array[index];
       else
       return array[index + 1];
    }
    max = Findmaxnumber(array, index + 1, len);
    if(array[index] > max)
        return array[index];
    else
        return max;
}
