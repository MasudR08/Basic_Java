
package Array_demo;

import java.util.Scanner;

/**
 *
 * @author Masud Rana
 */
public class ArrayMatrix {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        int A[][]=new int[2][3];
        int B[][]=new int[2][3];
        System.out.println("Enter Element of A:");
        for (int row = 0; row < 2; row++) {
            for (int col = 0; col < 3; col++) {
                System.out.printf("A[%d][%d]=",row,col);
                A[row][col]=input.nextInt();
            }
        }
        System.out.println("Enter Element of B:");
        for (int row = 0; row < 2; row++) {
            for (int col = 0; col < 3; col++) {
                System.out.printf("B[%d][%d]=",row,col);
                B[row][col]=input.nextInt();
            }
        }
        System.out.println();
        System.out.println("The Matrix of A :");
        for (int row = 0; row < 2; row++) {
            for (int col = 0; col < 3; col++) {
                System.out.print(" \t "+A[row][col]);
            }
            System.out.println();
        }
        System.out.println("The Matrix of B :");
        for (int row = 0; row < 2; row++) {
            for (int col = 0; col < 3; col++) {
                System.out.print(" \t "+B[row][col]);
            }
            System.out.println();
            
        }
        
        System.out.println();
        System.out.println(" A + B :");
        for (int row = 0; row < 2; row++) {
            for (int col = 0; col < 3; col++) {
                System.out.print(" \t "+(A[row][col]*B[row][col]));
            }
            System.out.println();
            
        }
    }
      
 
}
