
package Practice3;

public class Teacher {
    public static void main(String[] args) {
        Person p1=new Person();
        p1.setName("Anisul Islam");
        System.out.println("Name :"+p1.getName());
        p1.setGender("Male");
        System.out.println("Gender :"+p1.getGender());
        p1.setAge(35);
        System.out.println("Age :"+p1.getAge());
        System.out.println("");
        Person p2=new Person();
        p2.setName("Mahabubur Rahman");
        p2.setGender("Male");
        p2.setAge(38);
        System.out.println("Name :"+p2.getName());
        System.out.println("Gender :"+p2.getGender());
        System.out.println("Age :"+p2.getAge());
    }
}
