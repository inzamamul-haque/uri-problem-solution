#include<stdio.h>
int main()
{
   double a,b,c,d,e,f,g,h,pi=3.14159;
   scanf("%lf%lf%lf",&a,&b,&c);
   d=(a*c)/2;
   printf("TRIANGULO: %.3lf\n",d);
   e=(c*c)*pi;
   printf("CIRCULO: %.3lf\n",e);
   f=((a+b)*c)/2;
   printf("TRAPEZIO: %.3lf\n",f);
   g=(b*b);
   printf("QUADRADO: %.3lf\n",g);
   h=(a*b);
   printf("RETANGULO: %.3lf\n",h);
   return 0;
}

