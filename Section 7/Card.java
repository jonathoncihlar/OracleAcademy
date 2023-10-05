/**
 * Card
 * Implements a solution for Oracle Academy's Java Foundations Course
 * for the Section 7. This class models the magnetic card, which only keeps track of
 * the credit balance, ticket balance and ID number. It has no ability to perform any math
 * or check/prevent balances from going negative.
 */

public class Card {
        /** Tracks the next available id across all objects **/
    private static int nextID = 1;

        /** The id for this card **/
    private int id;
        /** the current credit balance **/
    private int creditBalance;
        /** the current ticket balance **/
    private int ticketBalance;

    /**
     * Accessor method for nextID
     * @return int the next available ID
     */
    public static int getNextID() {
        return nextID;
    }
    /**
     * Sets the next ID. The calculation of the next ID must happen outside this class.
     * @param id the next ID to assign.
     */
    public static void setNextID(int id) {
        nextID = id;
    } 

    /**
     * Default constructor
     * @param ID the ID to assign this card
     */
    public Card(int ID) {
        id = ID;
    }

    /**
     * Accessor method for this card's ID
     * @return this card's ID
     */
    public int getID() {
        return id;
    }

    /**
     * Accessor method for current credit balance.
     * @return the current credit balance
     */
    public int getCreditBalance() {
        return creditBalance;
    }

    /**
     * Sets current credit balance.
     * @param cb the new credit balance
     */
    public void setCreditBalance(int cb) {
        creditBalance = cb;
    }
    /**
     * Accessor method for current ticket balance.
     * @return the current ticket balance
     */
    public int getTicketBalance() {
        return ticketBalance;
    }

    /**
     * Sets current ticket balance.
     * @param tb the new ticket balance
     */
    public void setTicketBalance(int tb) {
        ticketBalance = tb;
    }

}
