#include<stdio.h>
int main()
{
    double a,b,c,d,e,f,g;
    scanf("%lf%lf",&a,&b);
    c=b*4.00;
    d=b*4.50;
    e=b*5.00;
    f=b*2.00;
    g=b*1.50;
    if(a==1)
    printf("Total: R$ %.2lf\n",c);
    else if(a==2)
    printf("Total: R$ %.2lf\n",d);
    else if(a==3)
    printf("Total: R$ %.2lf\n",e);
    else if(a==4)
    printf("Total: R$ %.2lf\n",f);
    else if(a==5)
    printf("Total: R$ %.2lf\n",g);
    return 0;
}
