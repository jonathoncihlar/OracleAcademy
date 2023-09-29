/**
 * ValidatePin
 * Implements a solution for Oracle Academy's Java Foundations Course
 * for the Section 6 Practice Problem 1, which validates a PIN
 * @author Jon Cihlar
 * @version 1.0
 */

import java.util.Scanner;

class ValidatePin {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int validPin = 1485;
        int userPin;
            // prompt and get pin
        System.out.print("Enter a pin: ");
        userPin = sc.nextInt();

        while (userPin != validPin) {
            System.out.print("Incorrect pin. Try again: ");
            userPin = sc.nextInt();
        }
        System.out.println("Correct pin. Account access granted!");
        sc.close();
    }
}