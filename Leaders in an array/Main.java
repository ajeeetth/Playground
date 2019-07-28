#include <stdio.h>
int main() 
{
    int arrSize;
  	scanf("%d", &arrSize);
  	int arr[arrSize], i;
  	for(int i = 0; i<arrSize; i++)
    {
      scanf("%d", &arr[i]);
    }
  	int n = sizeof(arr)/sizeof(arr[i]);
  	PrintLeaders(arr, n);
    return 0;
}
void PrintLeaders(int arr[], int size)
{
	 for (int i = 0; i < size; i++) 
    { 
        int j; 
        for (j = i+1; j < size; j++) 
        { 
            if (arr[i] <= arr[j]) 
                break; 
        }     
        if (j == size)
		   printf("%d ", arr[i]);
	}
}