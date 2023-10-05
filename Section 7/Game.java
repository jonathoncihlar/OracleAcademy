/**
 * Card
 * Implements a solution for Oracle Academy's Java Foundations Course
 * for the Section 7. This class models a game, which can manipulate and display card objects.
 * @author Jon Cihlar
 * @version 1.0
 */

public class Game {
            /** The number of credits required to play **/
    private int creditsToPlay;
    
    /** Max tickets that can be awarded **/
    private int maxTicketsToAward;

    /**
     * Default constructor
     * @param creditsToPlay The number of credits required to play this game 
     * @param maxTickets The maximum number of tickets this game awards 
     */
    public Game(int credits,int maxTickets) {
        creditsToPlay = credits;
        maxTicketsToAward = maxTickets;
    }

    /**
     * Plays the game. If there are enough credits on the card, that amount is deducted
     * from the card, and a random number of tickets between 1 and maxTicketsToAward will 
     * be added to the card. This method will print out the tickets won and details for the card.
     * @param card The card swiped to play the game
     */
    public void play(Card card) {
        if (card.getCreditBalance() < creditsToPlay) {
            System.out.println("Not enough credits to play.");
            return;
        }
            // deduct credits
        card.setCreditBalance(card.getCreditBalance() - creditsToPlay);
        
            // get number of tickets to award
        int ticketsWon = (int)(Math.random() * (maxTicketsToAward - 1) + 1);
        card.setTicketBalance(card.getTicketBalance() + ticketsWon);
            // output
        System.out.printf("Tickets won: %d", ticketsWon);
    }
}
