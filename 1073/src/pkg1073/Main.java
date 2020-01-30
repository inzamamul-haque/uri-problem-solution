
package pkg1073;

import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int a;
        a=input.nextInt();
        for(int i=2;i<=a;i++){
            if(i%2==0){
            System.out.println(i+"^2 = "+(i*i));
            }
            
        }
        
    }
    
}
