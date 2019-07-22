#include <stdio.h>
int main() {
	//Type your code

int n,r;
scanf("%d",&n);
      r=n%10;

while(n>9)
{
    n=n/10;
    
}
printf("%d",n+r);

	return 0;
}