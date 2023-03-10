/*
 * This is a superclass for a standard deck of tarot cards.
 * @author Brady Manske
 * @version 2023/01/22
 */
public class Card {
    // declaring field;
    protected boolean upright;
    
    // Returns a tarot card's title and orientation
    public String toString() {
        return "Title";
    } // end of toString method
    
    // Returns a tarot card's roman numeral
    public String getNumeral() {
        return "0";
    } // end of getNumeral method
    
    // Returns a paragraph describing what
    // a tarot card means in relation to the user
    public String getDescription() {
        return "Description";
    } // end of getDescription method
    
    // Returns a boolean representing the orientation
    // of a tarot card
    public boolean isUpright() {
        return (upright);
    } // end of isUpright method
} // end of Card superclass
