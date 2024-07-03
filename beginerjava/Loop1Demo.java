
package beginerjava;

import java.util.Scanner;

public class Loop1Demo {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        int m,n;
        System.out.print("Enter m :");
        m=input.nextInt();
        System.out.print("Enter n :");
        n=input.nextInt();
        int sum=0;
        for (int i = m; i <= n; i++) {
            if(i%2!=0){
                sum+=i;
            }
        }
        System.out.println("The sum of odd num from " +m+ "-" +n+ " is :" +sum);
    }
    
    
}
