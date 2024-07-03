
package Practice;


public class Area {
    private double length;
    private double breadth;
    
    public void getarea(){
        double area=length*breadth;
        System.out.println("Area is :"+area);
    }
 
   public double getLength(){
       return length;
   }
   public void setLength(double length){
       this.length=length;
   }
   public double getBreadth(){
       return breadth;
   }
   public void setBreadth(double breadth){
       this.breadth=breadth;
   }
    public static void main(String[] args) {
        Area rectangle=new Area();
        rectangle.setLength(25);
        rectangle.setBreadth(10);
        System.out.println(rectangle.getLength());
        System.out.println(rectangle.getBreadth());
        rectangle.getarea();
    }

 
}