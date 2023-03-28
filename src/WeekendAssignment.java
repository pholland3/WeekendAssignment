/**
 * @Class: WeekendAssignment
 * @Author: Peyton Holland
 * @Version 1.0
 * @Course: ITEC 2140 Section 05 Spring 2023
 * @Written: 28 March 2023
 *
 * Description - WeekendAssignment redo.
 */

import java.util.Scanner;

public class WeekendAssignment {
    public String reverseDoubleChar(String str) {
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

    public int sumOfDigits(int number) {
        int digit = 0;
        int sum = 0;

        while (number > 0) {
            digit = number % 10;
            sum = sum + digit;
            number = number / 10;
        }
        return sum;
    }

    public String birthdayName(String greetName) {
        String birthdayGreeting = "Happy birthday, " + greetName + "!";
        return birthdayGreeting;
    }

    public String missingFront(String frontString) {
        return frontString.substring(3);
    }

    public String swapEnds(String swapString) {
        String swappedString = "";
        String middleString = "";
        int length = swapString.length();
        middleString = swapString.substring(1, length - 1);
        swappedString += swapString.charAt(length - 1);
        swappedString += middleString;
        swappedString += swapString.charAt(0);
        return swappedString;
    }

    public String everyOther(String everyOtherString) {
        String everyOtherReturn = "";
        for (int i = 0; i < everyOtherString.length(); i++) {
            int counter = i;
            if (counter % 2 == 0) {
                everyOtherReturn += everyOtherString.charAt(i);
            }
        }
        return everyOtherReturn;
    }

    public String nonStart(String nonStart1, String nonStart2) {
        String nonStartString = "";
        for (int i = 1; i < nonStart1.length(); i++) {
            nonStartString += nonStart1.charAt(i);
        }
        for (int j = 1; j < nonStart2.length(); j++) {
            nonStartString += nonStart2.charAt(j);
        }
        return nonStartString;
    }

    public int fibonacci(int value) {
        int a = 0, b = 1, c, i = 0;

        while (i < value) {
            System.out.println(a);
            c = a + b;
            a = b;
            b = c;
            i++;
        }
        return a;
    }

    public boolean hasPalindrome(String palindrome) {
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

    public boolean powerOfTwo(int power) {
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



    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        WeekendAssignment test = new WeekendAssignment();
        System.out.println("reverseDoubleChar");
        System.out.println("reverseDoubleChar test - hello: " + test.reverseDoubleChar("Hello"));
        System.out.println("reverseDoubleChar test - testing: " + test.reverseDoubleChar("testing"));
        System.out.println("reverseDoubleChar test - reverse: " + test.reverseDoubleChar("reverse"));
        System.out.println("");
        System.out.println("sumOfDigits");
        System.out.println("sumOfDigits test - 123: " + test.sumOfDigits(123));
        System.out.println("sumOfDigits test - 2943: " + test.sumOfDigits(2943));
        System.out.println("sumOfDigits test - 54321: " + test.sumOfDigits(54321));
        System.out.println("");
        System.out.println("birthdayName test - Peyton: " + test.birthdayName("Peyton"));
        System.out.println("birthdayName test - Dr. Park: " + test.birthdayName("Dr. Park"));
        System.out.println("birthdayName test - everyone: " + test.birthdayName("everyone"));
        System.out.println("");
        System.out.println("missingFront test - testing: " + test.missingFront("testing"));
        System.out.println("missingFront test - assignment: " + test.missingFront("assignment"));
        System.out.println("missingFront test - java:  " + test.missingFront("java"));
        System.out.println("");
        System.out.println("swapEnds test - testing: " + test.swapEnds("testing"));
        System.out.println("swapEnds test - fortunate: " + test.swapEnds("fortunate"));
        System.out.println("swapEnds test - length: " + test.swapEnds("length"));
        System.out.println("");
        System.out.println("everyOther test - alleviate: " + test.everyOther("alleviate"));
        System.out.println("everyOther test - magnanimous: " + test.everyOther("magnanimous"));
        System.out.println("everyOther test - effervescent: " + test.everyOther("effervescent"));
        System.out.println("");
        System.out.println("nonStart test - efficient, testing: " + test.nonStart("efficient","testing"));
        System.out.println("nonStart test - actuality, eventuality: " + test.nonStart("actuality","eventuality"));
        System.out.println("nonStart test - punctual, effective: " + test.nonStart("punctual","effective"));
        System.out.println("");
        System.out.println("fibonacci test - 10: " + test.fibonacci(10));
        System.out.println("");
        System.out.println("hasPalindrome test - testing: " + test.hasPalindrome("testing"));
        System.out.println("hasPalindrome test - racecar: " + test.hasPalindrome("racecar"));
        System.out.println("hasPalindrome test - repaper: " + test.hasPalindrome("repaper"));
        System.out.println("");
        System.out.println("powerOfTwo test - 2: " + test.powerOfTwo(2));
        System.out.println("powerOfTwo test - 15: " + test.powerOfTwo(15));
        System.out.println("powerOfTwo test - 48: " + test.powerOfTwo(48));
        System.out.println("");
    }
}



