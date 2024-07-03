
package Practice2;

public class Test {
    public static void main(String[] args) {
        Batsman b1=new Batsman();
        System.out.println("Batsman Information :");
        b1.name="Virat Kholi";
        b1.number=18;
        b1.score=85;
        b1.displayInformation1();
        System.out.println("");
        
        Bowler ball=new Bowler();
        System.out.println("Bowler Information :");
        ball.name="Rishad Hossain";
        ball.number=87;
        ball.figure="4-2-24";
        ball.displayInformation2();
        System.out.println("");
        
        AllRounder all=new AllRounder();
        System.out.println("AllRounder Information :");
        all.name="Shakib AL Hasan";
        all.number=75;
        all.score=56;
        all.impact="4-1-25";
        all.displayInformation3();
    }
}
