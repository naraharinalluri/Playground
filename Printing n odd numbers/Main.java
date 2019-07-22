#include <stdio.h>
int main() {
int n,k;
  scanf("%d",&n);
  k=(n*2)-1;
  for(int i=1;i<=k;i++)
  {
    printf("%d\n",i);
    i++;
  }
  return 0;
}