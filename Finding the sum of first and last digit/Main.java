#include<stdio.h>

int main() {

   int n, r, fd, ld, sum, rev = 0;

   //printf("Enter a Number :");
   scanf("%d", &n);

   ld = n % 10;

   while (n > 0) {
       r = n % 10;
       rev = rev * 10 + r;
       n = n / 10;
   }

   fd = rev % 10;
   sum = fd + ld;
   printf("%d", sum);

   return 0;
}