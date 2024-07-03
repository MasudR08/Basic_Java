
package beginerjava;

import java.util.Scanner;


public class Product {
    public static void main(String[] args) {
        Scanner input= new Scanner(System.in);
        int id;
        Scanner name= new Scanner(System.in);
        String title;
        Scanner value=new Scanner(System.in);
        String price;
        Scanner des=new Scanner(System.in);
        String description;
        Scanner cat=new Scanner(System.in);
        String category;
        System.out.print("Enter id no :");
        id=input.nextInt();
        System.out.println("Enter title :");
        title=name.nextLine();
        System.out.println("Enter price :");
        price=value.nextLine();
        System.out.println("Enter description :");
        description=des.nextLine();
        System.out.println("Enter category :");
        category=cat.nextLine();
        System.out.println("Id is :"+id);
        System.out.println("Title is :"+title);
        System.out.println("Price is :"+price);
        System.out.println("Description is :"+description);
        System.out.println("Category is :"+category);
        
        
    }
    
}
