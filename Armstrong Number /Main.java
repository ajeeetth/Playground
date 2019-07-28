#include <stdio.h>
int main() {
	int num,a,sum=0,temp;
    scanf("%d",&num);
    temp = num;
    while(num>0)
    {
      a = num%10;
      sum += a*a*a;
      num = num/10;
    }
    if(sum == temp)
    {
      printf("Armstrong Number\n");
    }
 	else
    {
      printf("Not an Armstrong Number");
    }
  return 0;
}