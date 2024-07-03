
package beginerjava;

import java.util.Scanner;


public class Assignment8 {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        char master,fluent;
        
        System.out.print("Are you completed your masters?press y/n :");
        master=input.next().charAt(0);
        
        System.out.print("Are you fluent in english?press y/n :");
        fluent=input.next().charAt(0);
        
        if(master=='y' && fluent=='y'){
            System.out.println("You are eligible for work");
        }
        else {
            System.out.println("You are not eligible");
        }
    }
    
}
