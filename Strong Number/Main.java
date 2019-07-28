#include <stdio.h>
int main() {
	int num,i,p,r,sum=0,temp;
    scanf("%d",&num);
    temp = num;
    while(num)
    {
      i=1;
      p=1;
      r = num%10;
      while(i<=r)
      {
        p = p*i;
        i++;
      }
      sum =sum+p;
      num =num/10;
    }
    if(sum == temp)
    {
      printf("Yes");
    }
    else
    {
      printf("No");
    }
	return 0;
}