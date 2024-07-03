
package beginerjava;

import java.util.Scanner;


public class Assignment5 {

    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        int age;
        System.out.print("Enter ur age :");
        age=input.nextInt();
        
       if(age>=18){
           System.out.println("Ur a vooter");
           
    }
       else {
           System.out.println("Unavailable for voot!");
       }  
    }
    
}
