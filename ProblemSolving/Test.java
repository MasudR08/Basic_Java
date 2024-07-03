
package ProblemSolving;

public class Test {
    public static void main(String[] args) {
        
        Shape shape;
        shape=new Rectangle(10,20);
        shape.area();
        System.out.println("");
        shape=new Triangle(10,20);
        shape.area();
        System.out.println("");
        shape=new Circle(5);
        shape.area();
        
    }
}
