#include<stdio.h>

int main()
{
    float a,b,s;
    scanf("%f%f",&a,&b);
    a=(a*3.5);
    b=(b*7.5);
    s=((a+b)/(3.5+7.5));
    printf("MEDIA = %.5f\n",s);
    return 0;
}
