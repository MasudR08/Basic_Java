
package Practice5;


  abstract class Animal { 
    private  String name,color; 
  
     public Animal(String name,String color) { 
        this.name = name;
        this.color=color;
    } 
  
    public abstract void display(); 
  
    public String getName() { 
        return name; 
    } 
    public String getColor(){
        return color;
    }
} 
  
class Dog extends Animal { 
     public Dog(String name,String color) { 
        super(name,color); 
    } 
  
    @Override
    public void display() 
    { 
        
        System.out.println("Name :"+getName()+"gew gew");
        System.out.println("Color "+getColor());
       
    } 
  
} 
  
class Cat extends Animal { 
    public Cat(String name,String color) { 
        super(name,color); 
    } 
  
    @Override
    public void display() 
    { 
        System.out.println("Name :"+getName()+"mew mew"); 
        System.out.println("Color "+getColor()); 
    } 
} 
  
public class Main { 
    public static void main(String[] args) 
    { 
        Animal myDog = new Dog("Buddy :","White :"); 
        Animal myCat = new Cat("Fluffy:","Black :"); 
  
        myDog.display(); 
        myCat.display(); 
    } 
}