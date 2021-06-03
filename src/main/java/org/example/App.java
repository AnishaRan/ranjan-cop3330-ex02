package org.example;
import java.util.Scanner;

/*
 *  UCF COP3330 Summer 2021 Assignment 2 Solution
 *  Copyright 2021 Anisha Ranjan
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
