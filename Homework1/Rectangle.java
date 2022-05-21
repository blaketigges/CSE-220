
public class Rectangle {
    private int height, width;
    public Rectangle(int x, int y) {
        height=x;
        width=y;
    }
    public void printDims() {
        System.out.println("This rectangle has height " + height + " and width " + width);
    }
    
    public void printArea() {
            System.out.println("This rectangle has area of " + height*width + " units squared.");
    }
    
}