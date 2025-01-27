// MadLibs.java
// dH 1/26/2025
// Ask the user for a series of words (e.g., a noun, verb, adjective) and substitute them into a short predefined story.

import java.util.Scanner;

public class MadLibs {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String[] words = new String[3];

        System.out.println("give me a noun.");
        words[0] = sc.next();

        System.out.println("give me a verb.");
        words[1] = sc.next();

        System.out.println("give me an adjective.");
        words[2] = sc.next();

        System.out.println("There was once a " + words[0] + " that always wanted to " + words[1] + " in the house that was very " + words[2]);

    }
}