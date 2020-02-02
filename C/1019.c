#include<stdio.h>
int main()
{
    int a,b,c,d,e;
    scanf("%d",&a);
    d=(a/60)/60;
    e=(a/60)%60;
    c=a%60;
    printf("%d:%d:%d\n",d,e,c);
    return 0;
}
