#include <stdio.h>
int main() 
{
    int arrSize;
  	scanf("%d", &arrSize);
  	int ar[arrSize];
 	for(int i=0;i<arrSize;i++)
    {
    	scanf("%d", &ar[i]);
    }
  	int n = sizeof(ar)/sizeof(ar[0]);
    n = removeDuplicates(ar, n);
  	for(int i=0;i<n-1;i++)
    {
      printf("%d ", ar[i]);
    }
	return 0;
}

int removeDuplicates(int ar[], int n)
{
  if(n==0||n==1)
  return n;
  int temp[n];
  int j=0;
  for(int i=0;i<n;i++)
  {
  	if(ar[i]!=ar[i+1])
      ar[j++]=ar[i];
  }
  ar[j++] = ar[n-1];
  return j;
}