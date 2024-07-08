
package Array_demo;

import java.util.Scanner;


public class Prac2 {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        int num1[][]=new int [2][3];
        int num2[][]=new int [2][3];
        
        System.out.println("Enter The Element of Num1 :");
        for (int row = 0; row < 2; row++) {
            for (int col = 0; col < 3; col++) {
                System.out.printf("num1[%d][%d]=",row,col); 
            num1[row][col]=input.nextInt();
                   
            }
        }
        System.out.println("Enter The Element of Num2 :");
        for (int row = 0; row < 2; row++) {
            for (int col = 0; col < 3; col++) {
              System.out.printf("num1[%d][%d]=",row,col);   
            num2[row][col]=input.nextInt();
             
            }
        }
        System.out.println();
        System.out.println("The Matrix of Num1 :");
        for (int row = 0; row < 2; row++) {
            for (int col = 0; col < 3; col++) {
                System.out.print(" \t"+num1[row][col]);
            }
            System.out.println();
        }
        System.out.println("The Matrix of Num2 :");
        for (int row = 0; row < 2; row++) {
            for (int col = 0; col < 3; col++) {
                System.out.print(" \t"+num2[row][col]);
            }
            System.out.println();
        }
        System.out.println();
        System.out.println("The Matrix of Num1+Num2 is :");
        for (int row = 0; row < 2; row++) {
            for (int col = 0; col < 3; col++) {
                System.out.print(" \t "+(num1[row][col]+num2[row][col]));
                
            }
            System.out.println();
            
        }
        
        
    }
  
}
