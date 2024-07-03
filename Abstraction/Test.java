
package Abstraction;

public class Test {
    public static void main(String[] args) {
        
        MobileUser mu;
       mu =new Karim();
       mu.call();
       mu.sendMessage();
       System.out.println("");
       mu =new Rahim();
       mu.call();
       mu.sendMessage();
        
    }
}
