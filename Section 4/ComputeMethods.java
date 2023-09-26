
/** 
 * ComputeMethods
 * Implements a solution for Oracle Academy's Java Foundations Course
 * for the Section 4 Practice Problem 1, which is a series of methods that:
 * - convert Fahrenheit to Celsius
 * - computes hypotenuse of a right triangle given sides
 * - simulates rolling a two sided die  
 * @author Jon Cihlar
 * @version 1.0
 */

public class ComputeMethods {
    /** 
     * Converts Fahrenheit to Celsius
     * @param degreesF a temperature in Fahrenheit to convert
     * @return the converted temperature in Celsius as a double
     */
    public double fToC(double degreesF) {
        return (degreesF - 32) * 5 / 9;
    }

    /** 
     * Calculates the hypotenuse of a right triangle given sides a and b
     * @param a integer representing one non-hypotenuse side
     * @param b integer representing the other non-hypotenuse side
     * @return the hypotenuse as a double
     */
    public double hypotenuse(int a, int b) {
        return Math.sqrt(a*a+b*b);
    }
    
    /**
     * Simulates rolling a 6-sided die
     * @return an integer from 1-6 randomly chosen
     */
    public int roll() {
        return (int)((Math.random() * 5) + 1);
    }
}
