#include<stdio.h>

int main()
{
    float a,b,c,d;
    scanf("%f%f%f",&a,&b,&c);
    a=(a*2);
    b=(b*3);
    c=(c*5);
    d=((a+b+c)/(2+3+5));
    printf("MEDIA = %.1f\n",d);
    return 0;
}
