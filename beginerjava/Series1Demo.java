
package beginerjava;

import java.util.Scanner;

public class Series1Demo {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        
        int n;
        int sum=0;
        System.out.print("Enter last number : ");
        n=input.nextInt();
        
        for (int i = 1; i <= n; i++) {
            System.out.print(i+"x"+i+" ");
            sum+=i*i;
        }
        System.out.println();
        System.out.println(sum);
        
    }
    
}
