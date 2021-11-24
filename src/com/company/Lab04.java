package com.company;

import java.util.Scanner;

public class Lab04 {

    public static void main(String[] args) {

      /*  // Replace String and converted to Number
        String sampleText = "2hrs and 5 minutes";
        char hourOfString = sampleText.charAt(0);
        char minuteOfString = sampleText.charAt(9);
        int hourNumber = Integer.parseInt(String.valueOf(hourOfString));
        int minuteNumber = Integer.parseInt(String.valueOf(minuteOfString));

        System.out.println("Total time in minute is: " + (hourNumber * 60 + minuteNumber));
*/
        // Limited times of password input

        String myPassword = "password123";
        int timeOfInput = 0;

        while (timeOfInput < 3) {

            System.out.print("Please input your password: ");
            Scanner scanner = new Scanner(System.in);
            String userInput = scanner.next();

            if (userInput.equals(myPassword)) {
                System.out.println("You are good to go!");
                break;
            } else {
                System.out.println("Please try again");
                timeOfInput++;
            }
        }
        System.out.println("You are exceeded limited times");


    }
}
