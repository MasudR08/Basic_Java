
package HW;

public class BestFriend {
    String name;
    int age;
    String college;
    String course;
    String address;
 
     
      BestFriend (String name,int age,String college,String course,String address){
         this.name=name;
         this.age=age;
         this.college=college;
         this.course=course;
         this.address=address;
     }
      void diplayInformation(){
          System.out.println("Name :"+name);
          System.out.println("Age :"+age);
          System.out.println("College :"+college);
          System.out.println("Course :"+course);
          System.out.println("Address :"+address);
      }
     
   
    
    public static void main(String[] args)
    {
 
       BestFriend b = new BestFriend("Gulpreet Kaur",21,"BIT MESR","M.TECH","Kiriburu");
       b.diplayInformation();
       
        
    }

}
