import java.util.Scanner;

// SimpleInterest.java
// dH 1/26/2025
// Calculate the simple interest based on use inputs for principal, rate, and time.
public class SimpleInterest {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("What is your principal amount?");
        double principal = sc.nextDouble();

        System.out.println("What is your rate of interest?");
        double rate = sc.nextDouble();

        System.out.println("how many years?");
        double time = sc.nextDouble();

        System.out.println("Your simple interest is: " + (principal * rate * time) /100);


    }
}