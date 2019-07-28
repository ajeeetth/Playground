#include<stdio.h>

int square(int num)
{
	int sqr = num*num;
  	return sqr;
}

int main() {
   int num;
   scanf("%d",&num);
   int sq = square(num); 
  
   printf("%d",sq);
   return 0;
}