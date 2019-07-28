#include<stdio.h>
int main()
{
	int n,i,j;
    scanf("%d",&n);
    int turn = 0;
  	for(i=1;i<=n;i++)
    {
      for(j=1;j<=i;j++)
      {
        if(turn == 0)
        {
        	printf("*");
            turn = 1;
        }
        else
        {
         	printf("#");
          	turn = 0;
        }
      }
      printf("\n");
    }
	return 0;
}
