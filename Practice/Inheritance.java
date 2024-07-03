
package Practice;

public class Inheritance {
    String name,qualification;
    int age;
    public void displayInformation(){
        System.out.println("Name :"+name);
        System.out.println("Age :"+age);
        System.out.println("Qualification :"+qualification);
    }
    public class Teacher extends Inheritance{
       
        public void displayInformation2(){
            displayInformation();
           
        }
    }
        public static void main(String[] args) {
            Inheritance p1=new Inheritance();
            p1.name="Masud Rana";
            p1.age=25;
            p1.qualification="BSc in CSE";
            p1.displayInformation();
        
    }
}
