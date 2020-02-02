
package pkg1008;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner input =new Scanner(System.in);
        int a,b;
        float c,d;
        a=input.nextInt();
        b=input.nextInt();
        c=input.nextFloat();
        d=(float)b*c;
        System.out.println("NUMBER = "+a);
       System.out.printf("SALARY = U$ %.2f\n",d);
    }
    
}
