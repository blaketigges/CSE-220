public class Rectangle {
    private float height, width;
    public Rectangle(float x, float y) {
        height=x;
        width=y;
    }
    public Rectangle(float x ) { // overload rectangle to allow only one argument to be used
        height=x;
        width=x;
    }
    public void printDims() {
        System.out.println("This rectangle has height " + height + " and width " + width);
    }
    
    public void printArea() {
            System.out.println("This rectangle has area of " + height*width + " units squared.");
    }

    public void printDiag() { System.out.println("This rectangle has a diagonal of " + Math.sqrt(height*height + width*width)); } // prints diagonal of rectangle using pythagorean theorem in similar format to printdim and print area

    public void printPerimeter() { System.out.println("This rectangle has a perimeter of " + (height*2 + width*2)); } // prints perimeter of rectangle in similar format to printdim and print area
}