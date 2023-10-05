/**
 * Terminal
 * Implements a solution for Oracle Academy's Java Foundations Course
 * for the Section 7. This class models a terminal, which converts money to 
 * credits on a card. A terminal can also check a card's balance and redeem
 * tickets for prizes.
 * @author Jon Cihlar
 * @version 1.0
 */

public class Terminal {
        /**  a list of prize categories - enforced limit of three **/
    private PrizeCategory [] prizeCategories;

    /**
     * Default constructor
     * @param pc1 First prize category
     * @param pc2 Second prize category
     * @param pc3 Third prize category
     */
    public Terminal(PrizeCategory pc1, PrizeCategory pc2, PrizeCategory pc3) {
        prizeCategories = new PrizeCategory [] {pc1, pc2, pc3};
    }

    /**
     * Adds credits to a card at the rate of $1 -> 2 credits 
     * @param money Dollar amount added
     * @param card The card to which to add credits
     */
    public void buyCredits(int money, Card card) {
        card.setCreditBalance(card.getCreditBalance() + money * 2);
        System.out.printf("Added $%d -> %d credits", money, money*2);
        checkBalance(card);
    }    

    /**
     * Checks the balance of the card.
     * @param card The card to check the balance
     */
    public void checkBalance(Card card) {
        System.out.printf("ID: %d\nCredits %d\nTickets: %d\n", card.getID(), card.getCreditBalance(), card.getTicketBalance());
    }
}
