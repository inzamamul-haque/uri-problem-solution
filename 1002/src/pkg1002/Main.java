
package pkg1002;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
        double A,R;
        Scanner input=new Scanner(System.in);
        R=input.nextDouble();
        A=3.14159*R*R;
        System.out.printf("A=%.4f\n",A);
    }
    
}
