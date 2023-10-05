/**
 * GameNight
 * Implements a solution for Oracle Academy's Java Foundations Course
 * for the Section 7. This class serves as the tester class for all of the objects in the game.
 * @author Jon Cihlar
 * @version 1.0
 */

public class GameNight {
    public static void main(String args[]) {
            // create a card
        Card card1 = new Card(Card.getNextID());
            // increment and set the card to the next id
        Card.setNextID(Card.getNextID()+1);
            // create another card
        Card card2 = new Card(Card.getNextID());

            // build games
        Game game1 = new Game(10, 15);
        Game game2 = new Game(2, 5); 


    }
}
