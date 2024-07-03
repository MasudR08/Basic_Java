
package beginerjava;

import java.util.Scanner;

public class Assignment11 {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        int m,n;
        System.out.print("Enter the starting number :");
        m=input.nextInt();
        System.out.print("Enter the ending number :");
        n=input.nextInt();
        int sum=0;
        for(int i=m;i<=n;i++){
            if(i%2!=0){
                sum=sum+i;
            }
        }
        System.out.println("The sum of odd num from "+m+" to "+n+" is :"+sum);
        
    }
    
}
