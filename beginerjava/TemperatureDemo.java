
package beginerjava;

import java.util.Scanner;


public class TemperatureDemo {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        double fern,cels;
        System.out.print("Farenheit :");
        fern=input.nextDouble();
        
        cels=0.55*fern-32;
        System.out.println("Celcious is :"+cels);
    }
}
   