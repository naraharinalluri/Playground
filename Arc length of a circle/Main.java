#include<stdio.h>

int main()
{
  float a,r,arc;
    scanf("%f%f",&r,&a);
  arc=(a/360)*2*3.14*r;
  printf("%0.2f",arc);
  return 0;
}