
package Practice5;


public class Teacher extends Person {

    
    public Teacher(String name,int age){
       super(name,age);
       
    }
    
    @Override
    void display(){
        System.out.println("Name :"+getName());
        System.out.println("Age  :"+getAge()); 
        
    }
}
