
package beginerjava;

import java.util.Scanner;


public class ArithmaticDemo {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        int num1;
        System.out.print("Enter num1 :");
        num1=input.nextInt();
        int num2;
        System.out.print("Enter num2 :");
        num2=input.nextInt();
        int result;
        result=num1+num2;
        System.out.println(" Sum is :"+result);
        result=num1-num2;
        System.out.println(" Sub is :"+result);
        result=num1*num2;
        System.out.println(" Mul is :"+result);
        double result2=(double)num1/num2;
        System.out.println(" Div is :"+result2);
        result=num1%num2;
        System.out.println(" Reminder is :"+result);
    }
    
}
