/**
 * PrizeCartegory
 * Implements a solution for Oracle Academy's Java Foundations Course
 * for the Section 7. This class models a prize category. The class tracks
 * its name, tickets required to earn the prize, and how many items of the 
 * category are left in the terminal. The idea is that each terminal has 
 * three prize categories. This class provides getters for all instance variables and 
 * a setter for the prizes remaining.
 * @author Jon Cihlar
 * @version 1.0
 */

public class PrizeCategory {
        /** prize category name  **/
    private String categoryName;
        /** tickets required to earn the prize **/
    private int ticketsRequired;
        /** number of prizes of this type remaining **/
    private int prizesRemaining;

    /**
     * Default constructor
     * @param cn The category name
     * @param tr Tickets required to earn a prize
     * @param pr The number of prizees remaining in the terminal
     */
    public PrizeCategory (String cn, int tr, int pr) {
        categoryName = cn;
        ticketsRequired = tr;
        prizesRemaining = pr;
    }

    public String getCategoryName() {
        return categoryName;
    }

    public int getTicketsRequired() {
        return ticketsRequired;
    }

    public int getPrizesRemaining() {
        return prizesRemaining;
    }

    /**
     * Sets how many prizes are remaining - prevents setting a 
     * negative value. This design puts it on the terminal to 
     * deduct a prize.
     * @param pr positive int
     */
    public void setPrizesRemaining(int pr) {
        if (pr < 0) {
            System.out.println("Warning: cannot set prizes remaining to negative value.");
            return;
        };
        prizesRemaining = pr;
    }
}
