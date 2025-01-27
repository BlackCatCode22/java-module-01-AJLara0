// CharDetails.java
// dH 1/26/2025
// take a single character as input and display its Unicode value and whether it's a letter or digit.

import java.util.Scanner;

public class CharDetails {
    public static void main(String[] args) {

        System.out.println("Give me any single character.");
        Scanner sc = new Scanner(System.in);
        char character = sc.next().charAt(0);

        //using int changes the char into its unicode form
        int unicode = (int) character;


        boolean letter = Character.isLetter(character);
        boolean digit = Character.isDigit(character);

        if (letter) {
            System.out.println("This character is a letter, the unicode is " + unicode);
        }
        else if (digit) {
            System.out.println("This character is a digit, the unicode is " + unicode);
        }
        else {
            System.out.println("This character is neither, the unicode is " + unicode);
        }

    }
}