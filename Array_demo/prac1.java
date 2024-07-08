
package Array_demo;
import java.util.Scanner;


public class prac1 {

public static void main(String args[]){
Scanner input=new Scanner(System.in);
int a[][]=new int [3][3];  
int b[][]=new int [3][3]; 
    System.out.println("Enter The Element of A :");
  for(int row=0;row<3;row++){ 
  for(int col=0;col<3;col++){  
      System.out.printf("a[%d][%d]=",row,col);
  a[row][col]=input.nextInt();
    
}
}
  System.out.println("Enter The Element of B:");
  for(int row=0;row<3;row++){ 
  for(int col=0;col<3;col++){ 
          System.out.printf("b[%d][%d]=",row,col);
  b[row][col]=input.nextInt();
}
}
System.out.println("The Matrix of A:");
   for(int row=0;row<3;row++){ 
  for(int col=0;col<3;col++){  
  System.out.print(" \t "+a[row][col]);
 }
System.out.println();
}
System.out.println("The Matrix of B:");
for(int row=0;row<3;row++){ 
  for(int col=0;col<3;col++){  
  System.out.print(" \t "+b[row][col]);
}
System.out.println();
}
System.out.println("A + B :");
  for(int row=0;row<3;row++){ 
  for(int col=0;col<3;col++){  
  System.out.print(" \t "+(a[row][col]+b[row][col]));
  }
System.out.println();
  }
}
}
