
package Practice;

public class Person {
    private String name,gender;
    private int age,id;

   public String getName(){
       return name;
   }
   public void setName(String name){
       this.name=name;
   }
   public String getGender(){
       return gender;
       
   }
   public void setGender(String gender){
       this.gender=gender;
   }
   public int getAge(){
       return age;
   }
   public void setAge(int age){
       this.age= age;
   }
   public int getId(){
       return id;
   }
   public void setId(int id){
       this.id=id;
   }
    public static void main(String[] args) {
        Person person=new Person();
        person.setName("Konok Hossain");
        System.out.println(person.getName());
        person.setGender("Male");
        System.out.println(person.getGender());
        person.setAge(25);
        System.out.println(person.getAge());
        person.setId(157896);
        System.out.println(person.getId());
    }
   
    
}
