/**
 * TrafficLightChecker
 * Implements a solution for Oracle Academy's Java Foundations Course
 * for the Section 5 Practice Problem 2, which uses a switch statement to determine
 * what the next light in a traffic light is. The user enters 1 for red, 2 for green,
 * and 3 for yellow.
 * @author Jon Cihlar
 * @version 1.0
 */

import java.util.Scanner;

public class TrafficLightChecker {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
            // prompt for color code and store
        System.out.print("Enter a color code: ");
        int currentLight = sc.nextInt();
        sc.close();

        System.out.println(getNextLight(currentLight));
    }

        // process color code and output
    public static String getNextLight(int currentLight) {

        String msg = "Next traffic light is ";
            // figure out next light
            // order is 1-red, 2-green, 3-yellow
        switch(currentLight) {
            case 1:
                return msg + "green";
            case 2: 
                return msg + "yellow";
            case 3: 
                return msg + "red";
            default:
                return "Invalid color";
        }
    }
}
