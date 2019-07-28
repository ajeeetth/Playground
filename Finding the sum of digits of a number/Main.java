#include <stdio.h>
int main() {
	int num,r,sum=0;
    scanf("%d",&num);
    while(num)
    {
      r =num%10;
      num/=10;
      sum =sum+r;
    }
    printf("%d",sum);
      return 0;
}