
package beginerjava;

import java.util.Scanner;

public class Series2Demo {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        
        int n;
        int result=1;
        System.out.print("Enter the last number :");
        n=input.nextInt();
        
        for(int i=1;i<=n;i++){
            System.out.print(i+"x"+i+" ");
            result=result*i*i;
        }
        System.out.println();
        System.out.println(result);
    }
    
}
