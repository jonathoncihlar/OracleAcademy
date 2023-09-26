/**
 *  ColorRange
 * Implements a solution for Oracle Academy's Java Foundations Course
 * for the Section 5 Practice Problem 1, which implements a multi-way
 * conditional statement to return a color given a wavelength.
 * @author Jon Cihlar
 * @version 1.0
 */

import java.util.Scanner;

public class ColorRange {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

            // prompt for the wavelength and store
        System.out.print("Enter a color code: ");
        double wavelength = sc.nextDouble();
        sc.close();
            // output the conversion
        System.out.println(codeToColor(wavelength));

    }    

    /**
     * Returns a color given a wave length.
     * @param wavelength double representing the wavelength
     * @return The color matching the wavelength or a message that the wavelength 
     * is not part of the visible spectrum.
     */
    public static String codeToColor(double wavelength) {
            // rule out values outside the visible range
        if (wavelength >= 750 || wavelength < 380)
            return "The entered wavelength is not part of the visible spectrum";
            // tackle the remaining 
        else if (wavelength >= 620)
            return "Red";
        else if (wavelength >= 590)
            return "Orange";
        else if (wavelength >= 570)
            return "Yellow";
        else if (wavelength >= 495)
            return "Green";
        else if (wavelength >= 450)
            return "Blue";
        else
            return "Violet";
    }
}
