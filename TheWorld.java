/*
 * This defines a class representing the tarot card, "The World".
 * @author Brady Manske
 * @version 2023/01/22
 */
public class TheWorld extends Card {

    // Given a boolean representing card orientation,
    // constructs a The World card  
    public TheWorld(boolean upright) {
        this.upright = upright;
    } // end of constructor
    
    // Returns The World's title and orientation
    public String toString() {
        String title = "The World";
        if (!isUpright()) {
            title += " (Reversed)";
        } // end of if
        return title;
    } // end of toString method
    
    // Returns The World's roman numeral
    public String getNumeral() {
        return "XXI";
    } // end of getNumeral method
    
    // Returns a paragraph describing what
    // The World means in relation to the user
    public String getDescription() {
        if (isUpright()) {
            return "\tYou have reached your goals, and now The World is " +
                "yours.\nYou have achieved success and your talents are " +
                "being recognised by those around you.\nYou have a " +
                "feeling of inner pride and fulfillment.\nTake this " +
                "moment to celebrate the end of a long journey,\nbefore " +
                "you move on to your next.";

        } else { // reversed description
            return "\tYou are so close to reaching your goals,\nbut for " +
                "some reason you keep clinging to the past.\nThis may be " +
                "due to an outdated belief, or a sense that\nyour goals will " +
                "forever remain out of reach.\nRegardless, you have to move " +
                "on from the past.\nThis is a time to finish what you have " +
                "started.";
        } // end of if/else
    } // end of getDescription method
} // end of TheWorld class
