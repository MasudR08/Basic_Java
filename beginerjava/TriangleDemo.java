
package beginerjava;

import java.util.Scanner;


public class TriangleDemo {
    public static void main(String[] args) {
        
        Scanner input= new Scanner(System.in);
        double base,height,area;
        System.out.print("Enter a base :");
        base=input.nextDouble();
        System.out.print("Enter a height :");
        height=input.nextDouble();
        
        area = 0.5*base*height;
        System.out.println("Triangle Area is :"+area);
        
    }
    
}
