#include<stdio.h>
int main()
{
  //Type your code here
  int n,k,    sum;

    scanf("%d",&n);
  k=n%10;
  n=n/10;
  sum=k+n;
  printf("%d",sum);
  return 0;
}