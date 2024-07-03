
package Practice3;

public class Rectangle {
    public static void main(String[] args) {
        Area rectangle=new Area();
        
        rectangle.setLength(10);
        rectangle.setWidth(20);
        rectangle.setArea(10, 20);
        System.out.println("Length :"+rectangle.getLength());
        System.out.println("Width :"+rectangle.getWidth());
        System.out.println("Area :"+rectangle.getArea());
    }
}
