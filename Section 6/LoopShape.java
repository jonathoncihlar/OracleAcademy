/**
 * LoopShape
 * Implements a solution for Oracle Academy's Java Foundations Course
 * for the Section 6 Practice Problem 3. This class contains two methods 
 * that draw the shapes. The methods are static so the class doesn't need to be
 * instantiated since there are no internal states to track.
 * @author Jon Cihlar
 * @version 1.0
 */

public class LoopShape {

    /**
     * Outputs a rectangle of hashtags. 
     * @param width The width of the rectangle in hashtags
     * @param height The heigh of the rectangle in hashtags
     */
    public static void createRectangle(int width, int height) {
            // guard against negative values
        if (width < 1 || height < 1)
            return;
        for (int i = 0; i < height; i++) {
            for (int j = 0; j < width; j++) {
                if (i == 0 || i == height-1 || j == 0 || j == width-1)
                    System.out.print("#");
                else
                    System.out.print(" ");
            }
            System.out.println();
        }
    }
    
    /**
     * Outputs a right isoceles triangle of hashtags. 
     * @param leg The legs of the right isoceles triangle in hashtags
     */
    public static void createTriangle(int leg) {
            // guard against negative values
        if (leg < 1)
            return;
        for (int i = 0; i < leg; i++) {
                // add columns equal to the row number (row 1 -> 1 col, row 2 -> 2 cols)
            for (int j = 0; j < i+1; j++) {
                    // print a hashtag if we're at the bottom row, or 
                    // if the column is the first/last int he row
                if (i == leg-1 || j == 0 || j == i)
                    System.out.print("#");
                else
                    System.out.print(" ");
            }
            System.out.println();
        }
    }
}
