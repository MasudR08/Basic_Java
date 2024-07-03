
package beginerjava;

import java.util.Scanner;


public class InputDemo {
    public static void main(String[] args) {
        Scanner Input = new Scanner(System.in);
        String name;
        System.out.print("Enter a name :");
        name=Input.nextLine();
        System.out.println("Name :"+name );
    }
    
}
