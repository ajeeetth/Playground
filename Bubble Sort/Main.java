#include<stdio.h>
int main()
{
  int i, j, k, size;
  scanf("%d", &size);
  int arr[size];
  for(i=0;i<size;i++)
  {
    scanf("%d", &arr[i]);
  }
  for(j=size-1;j>=0;j--)
  {
    for(k=0;k<j;k++)
    {
      if(arr[k] > arr[k+1])
      {
        int temp = arr[k];
        arr[k] = arr[k+1];
        arr[k+1] = temp;
      }
    }
  }
  for(i=0;i<size;i++)
  {
    printf("%d\n",arr[i]); 
  }	
  return 0;
}