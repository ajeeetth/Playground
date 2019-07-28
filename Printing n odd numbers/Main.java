#include <stdio.h>
int main() {
	int n;
  	scanf("%d",&n);
    for(int i=1,j=1;j<=n;i=i+2,j++)
    {
      printf("%d\n",i);
    }
	return 0;
}