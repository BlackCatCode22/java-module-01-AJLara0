// SimpleCalculator.java
// dH1/26/2025
// Allow the user to input two numbers and perform basic arithmetic operations (addition, subtraction, multiplication, division)

import java.util.Scanner;

public class SimpleCalculator {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        double[] inputs = new double[2];

        //Using an array to store both of the users numbers
        System.out.println("What is your first number?");
        inputs[0] = sc.nextDouble();

        System.out.println("What is your second number?");
        inputs[1] = sc.nextDouble();

        //using char to store the operation to be used
        System.out.println("What is your arithmetic operation? +, -, *, or /");
        char operation = sc.next().charAt(0);

        if (operation == '+') {
            System.out.print(inputs[0]+inputs[1]);

        } else if (operation == '-') {
            System.out.print(inputs[0]-inputs[1]);

        } else if (operation =='*') {
            System.out.print(inputs[0]*inputs[1]);

        } else if (operation == '/') {
            System.out.print(inputs[0]/inputs[1]);

        }
        else System.out.println("invalid operation");

    }
}