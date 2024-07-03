
package Practice3;

public class Area {
    
    private int length,width;
    private double area;

    public int getLength() {
        return length;
    }

    public void setLength(int length) {
        this.length = length;
    }

    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        this.width = width;
    }
    
    public double getArea(){
        return area;
    }
    public void setArea(int length, int width){
        this.area=length*width;
    }
    
}
