#include<stdio.h>
int main()
{
  long int n,t=1;
  scanf("%ld",&n);
  
  for(int i=1;i<=n;i++)
  {
   
    t=t*i;
    
    }
  printf("%ld",t);
  return 0;
}