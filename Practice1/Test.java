
package Practice1;


public class Test {
    public static void main(String[] args) {
        Tecaher t1=new Tecaher();
        System.out.println("Teacher Info :");
        t1.name="Anisul Islam";
        t1.age=36;
        t1.qualification="MSc In CSE";
        t1.displayInformation1();
        System.out.println("");
        Student s1=new Student();
        System.out.println("Student Info :");
        s1.name="Masud Rana";
        s1.age=25;
        s1.id=115717;
        s1.displayInfroation2();
        
        
    }
}
