package Array_demo;

import java.util.Scanner;

public class Array {

    public static void main(String[] args) {

        double sum = 0;
        double avg;
        Scanner Input = new Scanner(System.in);

        double[] number = new double[10];
        System.out.println("Please Enter 10 Number :");
        for (int i = 0; i < number.length; i++) {//number.length meanse array value.
            number[i] = Input.nextDouble();
        }
        for (int i = 0; i < number.length; i++) {
            sum = sum + number[i];
        }
        avg = sum / number.length;
        System.out.println("Length :" + number.length);
        System.out.println("Sum is :" + sum);
        System.out.println("Avarage is :" + avg);

        
        double max=number[0];
        double min=number[0];
        
        for (int i = 1; i < 10; i++) {
           if(max<number[i]){
               max=number[i];
           }
        }
        for (int i = 1; i < 10; i++) {
           if(min>number[i]){
               min=number[i];
           }
        }
        System.out.println("Maximum Number is :"+max);
        System.out.println("Minimum Number is :"+min);
    }
}
