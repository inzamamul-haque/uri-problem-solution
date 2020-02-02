#include<stdio.h>

int main()
{
    char a[20];
    scanf("%s",&a);
    double b,c,g;
    scanf("%lf%lf",&b,&c);
    g=(b+(c*.15));
    printf("TOTAL = R$ %.2lf\n",g);
    return 0;
}
