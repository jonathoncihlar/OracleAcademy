/**
 * DisplayMultiples
 * Implements a solution for Oracle Academy's Java Foundations Course
 * for the Section 6 Practice Problem 2, which displays multiples of a user entered number.
 * Multiples of that number from 1-12 will be displayed.
 * @author Jon Cihlar
 * @version 1.0
 */


 import java.util.Scanner;
public class DisplayMultiples {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
            // prompt and collect number
        System.out.print("Choose an integer: ");
        int n = sc.nextInt();

            // output multiples
        for (int i = 1; i <= 12; i++) {
            System.out.println(String.format("%dx%d=%d", n, i, i*n));
        }
        sc.close();
    }
}
