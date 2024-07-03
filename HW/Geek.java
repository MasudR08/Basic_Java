
package HW;


public class Geek {
    // data members of the class.
    String name;
    int id;

    // Parameterized Constructor
    Geek(String name, int id)
    {
        this.name = name;
        this.id = id;
    }
    void dInfo(){
        System.out.println("Name :"+name);
        System.out.println("Id :"+id);
    }

    // Copy Constructor
    Geek(Geek obj2)
    {
        this.name = obj2.name;
        this.id = obj2.id;
    }
    void dInfo2(){
        System.out.println("Name :"+name);
        System.out.println("Id :"+id);
    }


    public static void main(String[] args)
    {
        // This would invoke the parameterized constructor.
        System.out.println("First Object");
        Geek geek1 = new Geek("Avinash", 68);
        geek1.dInfo();

        System.out.println();

        // This would invoke the copy constructor.
        Geek geek2 = new Geek(geek1);
        System.out.println("Copy Constructor used Second Object");
        geek2.dInfo2();
    }
}

