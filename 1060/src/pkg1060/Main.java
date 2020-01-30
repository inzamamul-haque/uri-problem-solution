
package pkg1060;
import java.util.Scanner;

public class Main {

    
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double a;      
        int i,count = 0;
        
        for(i=0;i<6;i++){
         a=input.nextDouble();
         if(a>0){
           count++;
         }
        }
         System.out.printf("%d valores positivos\n", count);
    }
    
}
