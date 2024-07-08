
package Array_demo;

import java.util.Scanner;

public class Assignment_18 {
    public static void main(String[] args) {
        
        Scanner input=new Scanner(System.in);
        String[]weekdays=new String[]{"Monday","Tuesday","Wednesday","Thursday","Friday","Saturday","Sunday"};
        int number;
        System.out.println("Please Enter Number 1-7 :");
        number=input.nextInt();
        for (int i = 0; i < weekdays.length; i++) {
         if(number==i+1){
             System.out.println("The Day is :"+weekdays[i]);
         }
        }
    }
 
}
