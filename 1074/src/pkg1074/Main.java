
package pkg1074;

import java.util.Scanner;

public class Main {

    
    public static void main(String[] args) {
       Scanner input = new Scanner(System.in);
       int a,b,i;
       a=input.nextInt();
       for(i=0;i<a;i++){
       b=input.nextInt();
       if(b==0){
           System.out.println("NULL");
       }
       else if(b%2==0){
           if(b>0){
           System.out.println("EVEN POSITIVE");
           }
           else{
               System.out.println("EVEN NEGATIVE");
           }
       
       }
       else{
           if(b>0){
           System.out.println("ODD POSITIVE");
           }
           else{
               System.out.println("ODD NEGATIVE");
           }
       
       }
       
       }
        
        
        
    }
    
}
