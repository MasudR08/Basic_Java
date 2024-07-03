
package HW;

public class Add {
    // Create a Main clas
  int x=5;
  int y=6;

  // Create a class constructor for the Main class
  public Add() {
   int add=x+y;
      System.out.println("Add :"+add);
    
  }

  public static void main(String[] args) {
    Add myObj = new Add();
    System.out.println(myObj);
  }
}


