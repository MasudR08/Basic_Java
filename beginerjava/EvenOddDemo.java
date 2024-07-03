
package beginerjava;

import java.util.Scanner;

public class EvenOddDemo {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        int num;
        System.out.print("Enter a positive Integer Number :");
        num=input.nextInt();
        
        if(num%2==0){
            System.out.println("Number is Even");
        }
        else {
            System.out.println("Number is Odd");
        }
    }
    
}
