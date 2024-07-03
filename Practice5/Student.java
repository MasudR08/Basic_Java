
package Practice5;

public class Student extends Person{
  
    public Student(String name,int age){
        super(name,age);
    }
    @Override
    void display() {
        System.out.println("Name :"+getName());
        System.out.println("Age :"+getAge());
   }
    
}
