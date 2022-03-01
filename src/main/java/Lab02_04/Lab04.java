package Lab02_04;

import java.util.Scanner;

public class Lab04 {

    public static void main(String[] args) {

        // Replace String and converted to Number
        String sampleText = "2hrs and 5 minutes";
        char hourOfString = sampleText.charAt(0);
        char minuteOfString = sampleText.charAt(9);
        int hourNumber = Integer.parseInt(String.valueOf(hourOfString));
        int minuteNumber = Integer.parseInt(String.valueOf(minuteOfString));

        System.out.println("Total time in minute is: " + (hourNumber * 60 + minuteNumber));

        // Limited times of password input

        String myPassword = "password123";
        int timeOfInput;

        for (timeOfInput = 0; timeOfInput < 3; timeOfInput++) {
            System.out.print("Please input your password: ");
            Scanner scanner = new Scanner(System.in);
            String userInput = scanner.next();

            if (userInput.equals(myPassword)) {
                System.out.println("Welcome Master !");
                break;
            } else {
                System.out.println("Please try again.");
            }
        }
        if (timeOfInput == 3) {
            System.out.println("You are exceed limited times");
        }

        // Extract digits from String NOT using Regex
        String myStr = "100 minutes";
        char[] strArray = myStr.toCharArray();
        String newString = "";

        for (char c : strArray) {
            if (Character.isDigit(c)) {
                newString += c;
            }
        }
        System.out.println(newString);

        //Check domain is secure or not - .COM / .NET
        String fullURL = "http://google.com";
        String headOfUrl = fullURL.substring(0, fullURL.indexOf(":"));
        String typeOfUrl = fullURL.substring(fullURL.indexOf("."));

        System.out.println("Type of URL Protocol: " + headOfUrl);
        System.out.println("Prefix of URL: " + typeOfUrl);


    }
}
