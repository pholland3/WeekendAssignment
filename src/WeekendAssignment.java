/**
 * @Class: WeekendAssignment
 * @Author: Peyton Holland
 * @Version 1.0
 * @Course: ITEC 2140 Section 05 Spring 2023
 * @Written: 27 March 2023
 *
 * Description - A collection of assignments meant to reinforce understanding of methods and loops.
 */

import java.util.Scanner;

public class WeekendAssignment {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("The reverseDoubleChar method is designed to reverse a string and display the");
        System.out.println("first three letters of the reversed string twice. Please enter the string");
        System.out.println("you wish to reverse in this way:");
        String str = input.nextLine();
        System.out.println(reverseDoubleChar(str));
        System.out.println("");
        System.out.println("The sumOfDigits method is designed to add the sum of all digits in a given");
        System.out.println("integer. Please enter the number you wish to perform this addition on:");
        int number = input.nextInt();
        System.out.println(sumOfDigits(number));
        System.out.println("");
        System.out.println("The birthdayName method is designed to accept an input of a name, and");
        System.out.println("return a birthday greeting to the name entered. Please enter a name: ");
        // Had to put in a null value input here in order for my greetName string to actually register, not sure
        // why this was the case -- but it worked after I added the null value.
        String nothing = input.nextLine();
        String greetName = input.nextLine();
        System.out.println(birthdayName(greetName));
        System.out.println("");
        System.out.println("The missingFront method is designed to return the entered string value");
        System.out.println("without the first three characters in the string. Please enter the string");
        System.out.println("you would like to see without the first three characters:");
        String frontString = input.nextLine();
        System.out.println(missingFront(frontString));
        System.out.println("");
        System.out.println("The swapEnds method is designed to take the first and last characters in a");
        System.out.println("string and reverse them. Please enter the string you would like to swap the");
        System.out.println("ends of.");
        String swapString = input.nextLine();
        System.out.println(swapEnds(swapString));
        System.out.println("");
        System.out.println("The everyOther method is designed to return the value of every other character");
        System.out.println("in the given string. Please enter the string you would like to take every other");
        System.out.println("character of:");
        String everyOtherString = input.nextLine();
        System.out.println(everyOther(everyOtherString));
        System.out.println("");
        System.out.println("The nonStart method is designed to concatenate two strings, neither of which will");
        System.out.println("contain the beginning of the respective string. Please enter two string values which");
        System.out.println("you would like to concatenate without their beginnings.:");
        System.out.println("Please enter the first string value: ");
        String nonStart1 = input.nextLine();
        System.out.println("Please enter the second string value: ");
        String nonStart2 = input.nextLine();
        System.out.println(nonStart(nonStart1, nonStart2));
        System.out.println("");
        System.out.println("The fibonacci method is designed to accept an integer value from the user, and then");
        System.out.println("return the fibonacci sequence for the first instances up to that value.");
        System.out.println("Please enter the value you would like to see for the fibonacci sequence: ");
        int value = input.nextInt();
        fibonacci(value);
        System.out.println("");
        System.out.println("The hasPalindrome method is designed to accept a string value from the user, and then");
        System.out.println("reverses that string, compares it to the string entered, and returns a boolean value");
        System.out.println("confirming whether or not the string entered is a palindrome.");
        System.out.println("Please enter the string you would like to check: ");
        String nothing2 = input.nextLine();
        String palindrome = input.nextLine();
        if (hasPalindrome(palindrome) == true) {
            System.out.println("The string " + palindrome + " is a palindrome.");
        } else {
            System.out.println("The string " + palindrome + " is NOT a palindrome.");
        }
        System.out.println("");
        System.out.println("The powerOfTwo method is designed to accept an integer input from the user, and then");
        System.out.println("determines whether the integer is a power of two, returning a boolean value to confirm.");
        System.out.println("Please enter the integer you would like to check :");
        int power = input.nextInt();
        if (powerOfTwo(power) == true) {
            System.out.println("The integer " + power + " is a power of two.");
        } else {
            System.out.println("The integer " + power + " is NOT a power of two.");
        }
    }

    public static String reverseDoubleChar(String str) {
        String reverse = "";
        String reverseDouble = "";
        int length = str.length();
        while (length > 0) {
            reverse += str.charAt(length - 1);
            length--;
        }
        for (int i = 0; i < 3; i++) {
            reverseDouble += reverse.charAt(i);
            reverseDouble += reverse.charAt(i);
        }
        return reverseDouble;
    }

    public static int sumOfDigits(int number) {
        int digit = 0;
        int sum = 0;

        while (number > 0) {
            digit = number % 10;
            sum = sum + digit;
            number = number / 10;
        }
        return sum;
    }

    public static String birthdayName(String greetName) {
        String birthdayGreeting = "Happy birthday, " + greetName + "!";
        return birthdayGreeting;
    }

    public static String missingFront(String frontString) {
        return frontString.substring(3);
    }

    public static String swapEnds(String swapString) {
        String swappedString = "";
        String middleString = "";
        int length = swapString.length();
        middleString = swapString.substring(1, length - 1);
        swappedString += swapString.charAt(length - 1);
        swappedString += middleString;
        swappedString += swapString.charAt(0);
        return swappedString;
    }

    public static String everyOther(String everyOtherString) {
        String everyOtherReturn = "";
        for (int i = 0; i < everyOtherString.length(); i++) {
            int counter = i;
            if (counter % 2 == 0) {
                everyOtherReturn += everyOtherString.charAt(i);
            }
        }
        return everyOtherReturn;
    }

    public static String nonStart(String nonStart1, String nonStart2) {
        String nonStartString = "";
        for (int i = 1; i < nonStart1.length(); i++) {
            nonStartString += nonStart1.charAt(i);
        }
        for (int j = 1; j < nonStart2.length(); j++) {
            nonStartString += nonStart2.charAt(j);
        }
        return nonStartString;
    }

    public static void fibonacci(int value) {
        int a = 0, b = 1, c, i = 0;

        while (i < value) {
            System.out.println(a + " ");
            c = a + b;
            a = b;
            b = c;
            i++;
        }
    }

    public static boolean hasPalindrome(String palindrome) {
        String reverse = "";
        int length = palindrome.length();
        while (length > 0) {
            reverse += palindrome.charAt(length - 1);
            length--;
        }

        if (palindrome.equals(reverse)) {
            return true;
        } else {
            return false;
        }
    }

    public static boolean powerOfTwo(int power) {
        boolean result = false;
        while (power > 0) {
            if (power % 2 == 0) {
                result = true;
                break;
            } else {
                result = false;
                break;
            }
        }
        return result;
    }
}



