
package Practice5;


public class Test {
    public static void main(String[] args) {
      Person person;
        System.out.println("Teacher Information :");
        person=new Teacher("Masud Rana",25);
        person.display();
        System.out.println("StudentInformation :");
        person=new Student("Rifat Hossain",14);
        person.display();
    
    }
}
