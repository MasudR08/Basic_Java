
package HW;

public class Vehicle {
  int modelYear;
  String modelName;

    public Vehicle() {
    }
  
 
   void displayInformation(){
       System.out.println("Model Name :"+modelName);
       System.out.println("Model Year :"+modelYear);
   }

   Vehicle(int year, String name) {
    this.modelYear = year;
    this.modelName = name;
  }
}
  

    

