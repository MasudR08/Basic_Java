
package HW;

public class Bus extends Vehicle{
    
    public Bus(String name){
        this.brandName=name;
    }
    String brandName;
    public void displayInformtion1(){
        System.out.println("Brand Name :"+brandName);
      
    }
    public static void main(String[] args) {
        Vehicle myCar=new Vehicle (1985,"Mustag");
        myCar.displayInformation();
        Bus myCar1=new Bus ("Ferrari");
        myCar1.displayInformtion1();
    }
}
