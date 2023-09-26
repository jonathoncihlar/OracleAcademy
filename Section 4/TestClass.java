/** 
 * TestClass
 * Implements a solution for Oracle Academy's Java Foundations Course
 * for the Section 4 Practice Problem 1. This class is the driver class
 * for ComputeMethods
 * @author Jon Cihlar
 * @version 1.0
 */

public class TestClass {
    public static void main(String args[]) {
            // construct using default constructor
        ComputeMethods cm = new ComputeMethods();
            // test the methods
        System.out.println("Temp in celsius is " + cm.fToC(-40));
        System.out.println("Hypotenuse is " + cm.hypotenuse(3, 4));
        System.out.println("The sum of the dice values is " + (cm.roll()+cm.roll()));
    }
}
