#include<stdio.h>
int is_prime(int m);
int main(){
    int n,i;
    scanf("%d", &n) ;   
    // Take numbers from 2 to given number
    // Check each number until it reaches the given number
    for(i = 2; i <= n; i++)
    {
        if(is_prime(i))// Function call
        {
            printf("%d\n", i);
        }
    }
    return 0;
}
// Function to find the prime number
int is_prime(int m)
{
    int isprime = 1,num;
    for(num = 2; num <= m/2; num++)
    {
        if(m % num == 0)
        {
            isprime = 0;
            break;
        }
    }
    return isprime;
}