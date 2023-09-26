
/** 
 * ComputeMethods
 * Implements a solution for Oracle Academy's Java Foundations Course
 * for the Section 4 Practice Problem 2, which splits a person's entered name
 * in "First Last" format and outputs it as "Last, F." This class has main and a utility 
 * method to do the work.
 * @author Jon Cihlar
 * @version 1.0
 */

import java.util.Scanner;

public class ProcessName {
    public static void main(String args[]) {
            // prompt for name and store
        Scanner sc = new Scanner(System.in);
        System.out.print("Type your name: ");
        String name = sc.nextLine();
        sc.close();

        System.out.println("Your name is: " + processName(name));
    }

    /**
     * Processes a name by splitting it apart and reversing it into Last, F. format.
     * @param fullName A person's full name as a String
     * @return the reversed name String in the format Last, F.
     */
    public static String processName(String fullName) {
        int spaceLocation = fullName.indexOf(" "); // find the space

        String firstInitial = fullName.substring(0, 1);
        String lastName = fullName.substring(spaceLocation+1);

        return lastName + ", " + firstInitial + ".";
    }
}
