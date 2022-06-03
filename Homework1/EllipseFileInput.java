import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;

public class EllipseFileInput {
    public static void main(String[] args) throws FileNotFoundException {
        File file = new File("EllipseAxes.txt"); // create file object
        Scanner fScan = new Scanner(file); // create scanner object
        System.out.println("Loading ellipse axes from file...");
        float a = fScan.nextFloat(); // get input and set to axis a
        float b = fScan.nextFloat(); // get input and set to axis b
        float area = (float)Math.PI * a * b; // calculate area
        System.out.println("The ellipse has an area of " + area); // print area
        float approxPerimeter = (float)Math.PI * (a + b); // calculate approximate perimeter
        System.out.println("A crude approximation of its perimeter is " + approxPerimeter); // print approximate perimeter
    }
}
