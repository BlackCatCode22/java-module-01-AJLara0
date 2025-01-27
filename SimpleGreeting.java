import java.util.Scanner;

// SimpleGreeting.java
// dH1/26/2025
// Write a program tha asks the user for their name and prints a personalized greeting.
public class SimpleGreeting {
    public static void main(String[] args) {

        // initial message greeting user
        System.out.println("hello, what is your name?");

        // creating scanner to hold user name
        Scanner sc = new Scanner(System.in);
        String scanned = sc.next();

        // printing out greeting with name that user inputted
        System.out.println("Hi, " + scanned + ". How are you doing today?");



    }
}