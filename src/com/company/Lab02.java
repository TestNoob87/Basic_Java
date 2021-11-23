package com.company;

import java.util.Scanner;

public class Lab02 {

    public static void main(String[] args) {

        System.out.print("Input your number: ");
        Scanner scanner = new Scanner(System.in);

        int userInput = scanner.nextInt();
        int[] myArr = new int[userInput];

        for (int i = 0; i < userInput ; i++) {
            System.out.print("Gia tri " + i + " : ");
            myArr[i] = scanner.nextInt();
        }

        int maxNumber = myArr[0];
        int minNumber = myArr[0];

        for (int checkedIndex = 1; checkedIndex < myArr.length; checkedIndex++) {
            if (myArr[checkedIndex] >=maxNumber) {
                maxNumber = myArr[checkedIndex];
            }
            if (myArr[checkedIndex] <=minNumber) {
                minNumber = myArr[checkedIndex];
            }
        }
        System.out.println("Max number is: " + maxNumber);
        System.out.println("Min number is: " + minNumber);

        float averageNumber = 0;

        for (int i : myArr) {
            averageNumber += i;
        }
        System.out.println("The Average Number of Array is: " + (averageNumber / myArr.length));

        // Re-arrange array
        int[] reArrangeList = new int[] {9,3, 6, 4, 1, 9, 8, 2, 3};



    }
}

