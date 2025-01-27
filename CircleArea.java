// CircleArea.java
//dH1/26/2025
// Calculate the area of a circle given its radius entered by the user.
import java.util.Scanner;


public class CircleArea {
    public static void main(String[] args) {

        //asking user for the radius
        System.out.println("What is the radius of your circle?");

        //storing radius (double is used since its the default type for decimal numbers, float is less precise)
        Scanner sc = new Scanner(System.in);
        double radius = sc.nextDouble();


        // the formula for the area of a circle
        double area = Math.PI * Math.pow(radius, 2);

        //prints out area of circle given the radius (I actually had some issues here and initially tried to print sc thinking that it would print the users radius, but it was printing the scanner object reference instead.)
        System.out.println("If the radius of the circle is " + radius + ", then the area of the circle is " + area);
    }
}