
package EncapTest;

public class Practice {
    
    private  String name,gender;
    private int age;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
    
   
    public static void main(String[] args) {
        Practice person=new Practice();
        System.out.println("Person1:");
        person.setName("Masud Rana");
        System.out.println(person.getName());
        person.setGender("Male");
        System.out.println(person.getGender());
        person.setAge(25);
        System.out.println(person.getAge());
        System.out.println();
        System.out.println("Person2:");
        Practice person2=new Practice();
        person2.setName("Baijed Ahmmed");
        System.out.println(person2.getName());
        person2.setGender("Male");
        System.out.println(person2.getGender());
        person2.setAge(25);
        System.out.println(person2.getAge());
        
        
    }
    
}
