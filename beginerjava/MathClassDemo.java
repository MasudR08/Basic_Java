
package beginerjava;

public class MathClassDemo {
    public static void main(String[] args) {
        
        int x=5;
        int y=-2;
        
        int max=Math.max(x, y);//*Max value means the maximum value from two number
        System.out.println("maxximum value = "+max);
        
        int min=Math.min(x, y);//*Minimum value means a minimum value from two number
        System.out.println("minimum value = "+min);
        
        int absulate=Math.abs(y);//*Absulate value meanse positive value if any negative values are there*//
        System.out.println("Absulate value = "+absulate);
        
        double power=Math.pow(x, y);//*math.power meanse is to the power *//
        System.out.println("x to the power y is = "+power);
        
        int round=Math.round(8.8f);//*Round value meanse a round value as integer number
        System.out.println("Round of 8.8f is = "+round);
        
        double pi=Math.PI;//*The pi meanse value of PI
        System.out.println("PI = "+pi);
    }
    
}
