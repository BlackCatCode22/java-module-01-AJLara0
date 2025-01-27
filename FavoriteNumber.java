import java.util.Scanner;

// FavoriteNumber.java
// dH1/26/2025
// Prompt the user to enter their favorite number and print it back along with a message
public class FavoriteNumber {
    public static void main(String[] args) {

        //printing out request for users number
        System.out.println("Hello what is your favorite number?");

        //creating scanner to hold users favorite number (using Int this time)
        Scanner sc = new Scanner(System.in);
        int scanned = sc.nextInt();

        //printing out response with users favorite number
        System.out.println("Wow, your favorite number is " + scanned + "? Mine is too!");


    }
}