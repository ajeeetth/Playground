#include<stdio.h>

int NaturalSum(int num)
{
    int sum=0;
	for(int i=1;i<=num;i++)
    {
        sum = sum+i;
    }
  return sum;
}

int main() {
    int num;
    scanf("%d",&num);
    int nat = NaturalSum(num);
    printf("%d",nat);
}