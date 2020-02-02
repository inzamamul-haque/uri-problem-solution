
package pkg1006;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        float A,B,C,D;
        Scanner input=new Scanner(System.in);
        A=input.nextFloat();
        B=input.nextFloat();
        C=input.nextFloat();
        A=A*2;
        B=B*3;
        C=C*5;
        D=(float)((A+B+C)/(2+3+5));
        System.out.printf("MEDIA = %.1f\n",D);
    }
    
}
