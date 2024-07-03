
package beginerjava;

import java.util.Scanner;

public class FactorialDemo {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        
        int num;
        int fact=1;
        System.out.print("Enter a positive number :");
        num=input.nextInt();
        
        for (int i = num; i>=1; i--) {
            
            fact=fact*i;
            
        }
        System.out.println("Fcatorial value of "+num+" is "+fact);
    }
    
}
