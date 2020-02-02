#include<stdio.h>
int main()
{
    int a,b,g,h;
    float c,i,d,e,f;
    scanf("%d%d",&a,&b);
    scanf("%f",&c);
    scanf("%d%d",&g,&h);
    scanf("%f",&i);
    d=(b*c);
    e=(h*i);
    f=d+e;
    printf("VALOR A PAGAR: R$ %.2f\n",f);
    return 0;

}
