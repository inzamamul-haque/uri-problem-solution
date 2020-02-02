
package pkg1009;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        String a;
        double b,c,d;
        a=input.nextLine();
        b=input.nextDouble();
        c=input.nextDouble();
        d=(b+(c*.15));
        System.out.printf("TOTAL = R$ %.2f\n",d);
    }
    
}
