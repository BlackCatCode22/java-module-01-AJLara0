// TempConverter.java
// dH1/26/2025
// Convert a temperature from fahrenheit to celsius

import java.util.Scanner;

public class TempConverter {
    public static void main(String[] args) {

        //initial question for user to answer
        System.out.println("What is your temperature in Fahrenheit?");

        //getting users response in fahrenheit
        Scanner sc = new Scanner(System.in);
        double temp1 = sc.nextDouble();

        //using formula to convert fahrenheit to celsius and saving it as temp 2
        double temp2 = (5.0 / 9.0) * (temp1 - 32);

        //printing out conversion to the user
        System.out.println("If it were " + temp1 + " outside in Fahrenheit, it would be " + temp2 + " in Celsius.");


    }
}