#include<stdio.h>
int main()
{
  int n;
  scanf("%d",&n);
  switch(n)
  {
    case 1: if(n==1)
      printf("One");
      break;
    case 2: if(n==2)
      printf("Two");
      break;
    case 3: if(n==3)
      printf("Three");
      break;
    case 4: if(n==4) 
      printf("Four");
      break;
    case 5: if(n==5)
      printf("Five");
      break;
    default: 
      printf("Invalid");
  }
  return 0;
}