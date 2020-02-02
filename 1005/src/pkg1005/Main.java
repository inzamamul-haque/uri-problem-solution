
package pkg1005;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        float A,B,C;
        A=input.nextFloat();
        B=input.nextFloat();
        C=(float)((A*3.5+B*7.5)/(3.5+7.5));
        System.out.printf("MEDIA = %.5f\n",C);
    }
    
}
