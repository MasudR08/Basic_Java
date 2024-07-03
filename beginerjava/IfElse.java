
package beginerjava;

import java.util.Scanner;


public class IfElse {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        int num;
        
        System.out.print("Enter an integar number :");
        num=input.nextInt();
        
        if(num>0){
            System.out.println("Number is postive");
        }
        else if(num<0){
            System.out.println("Number is Negative");
        }
        else{
            System.out.println("Number is Zero");
        }
        
    }
    
}
