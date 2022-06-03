import java.util.Scanner;

public class EllipseKBInput {
    public static void main(String[] args) {
        Scanner key = new Scanner(System.in);
        System.out.println("Enter ellipse axis a: ");
        float a = key.nextFloat(); // get input and set to axis a
        System.out.println("Enter ellipse axis b: ");
        float b = key.nextFloat(); // get input and set to axis b
        float area = (float)Math.PI * a * b; // calculate area
        System.out.println("The area of the ellipse is " + area); // print area
        float approxPerimeter = (float)Math.PI * (a + b); // calculate approximate perimeter
        System.out.println("The approximate perimeter of the ellipse is " + approxPerimeter); // print approximate perimeter
    }
}
