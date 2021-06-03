package org.example;
import java.util.Scanner;

/**
 * Hello world!
 *
 */
public class App
{
    public static void main( String[] args ) {
        Scanner scan = new Scanner(System.in);
        System.out.print("What is the input string? ");
        String inputString = scan.nextLine();

        int charNum = inputString.length();


        System.out.printf(inputString + " has %d characters.", charNum);

    }
}
