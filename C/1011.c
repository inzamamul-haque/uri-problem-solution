#include<stdio.h>
int main()
{
    double R,a,pi,c;
    scanf("%lf",&R);
    a=(R*R*R);
    pi=3.14159;
    c=(4.0/3)*pi*a;
    printf("VOLUME = %.3lf\n",c);
    return 0;
}
