
package beginerjava;

import java.util.Scanner;


public class Assignment7 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        char ans;
        
        System.out.print("Are you love java?if yes press Y/y,no then press N/n :");
        ans=input.next().charAt(0);
        
        if(ans=='y'||ans=='Y'){
           System.out.println("You are a java lover");
       }
       else if(ans=='n'||ans=='N'){
           System.out.println("You are not a java lover");
       }
       else {
           System.out.println("Your input is worng");
       }
    }
}
