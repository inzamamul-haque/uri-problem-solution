
package pkg1010;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
         int a,b,c,d;
        double e,f,g,h,i;
        Scanner input=new Scanner(System.in);
       
        a=input.nextInt();
        b=input.nextInt();
        e=input.nextDouble();
        c=input.nextInt();
        d=input.nextInt();
        f=input.nextDouble();
        g=b*e;
        h=d*f;
        i=g+h;
        System.out.printf("VALOR A PAGAR: R$ %.2f\n",i);
    }
    
}
