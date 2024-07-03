
package Polymorphism;

public class Test {
    public static void main(String[] args) {
        Person p=new Person();
      
        p.displayinformation();
        
        p =new Teacher();
       
        p.displayinformation();
    
        p=new Student();
 
        p.displayinformation();
    }
    
}
