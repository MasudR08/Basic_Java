
package beginerjava;

import java.util.Scanner;


public class ConditionalDemo {
    public static void main(String[] args) {
        Scanner input= new Scanner(System.in);
        int num1,num2,large;
        
        System.out.print("Enter num1 :");
        num1=input.nextInt();
        System.out.print("Enter num2 :");
        num2=input.nextInt();
        
        large=(num1>num2)?num1:num2;
        System.out.println("Larger number is :"+large);
    }
    
}
