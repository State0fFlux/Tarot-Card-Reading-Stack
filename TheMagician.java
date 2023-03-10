// Brady Manske
// 1/24/23
// CS&145
// Deck of Cards: The Magician

// This defines a class representing the tarot card, "The Magician"
public class TheMagician extends Card {

    // Given a boolean representing card orientation,
    // constructs a The Magician card
    public TheMagician(boolean upright) {
        this.upright = upright;
    } // end of constructor
    
    // Returns The Magician's title and orientation
    public String toString() {
        String title = "The Magician";
        if (!isUpright()) {
            title += " (Reversed)";
        } // end of if
        return title;
    } // end of toString method
    
    // Returns The Magician's roman numeral
    public String getNumeral() {
        return "I";
    } // end of getNumeral method
    
    // Returns a paragraph describing what
    // The Magician means in relation to the user
    public String getDescription() {
        if (isUpright()) {
            return "\tYou need to remember the power that you " +
                "possess.\nYou have all the necessary skills and " +
                "resources to manifest even their wildest dreams.\n" +
                "You only need to persevere and realise the " +
                "unlimited potential you’re harboring inside.\n\t" +
                "Though it might look as though there isn’t " +
                "much at your disposal,\nif you use your creative " +
                "ingenuity you will ultimately succeed.\n" +
                "To reach this point, however, you must remain" +
                "confident,\nand direct your energy toward your goals.";

        } else { // reversed description
            return "\tI sense there is a disconnect between you and " +
                "the Universe.\nIt may seem as though everything is " +
                "all going wrong.\nThis may lead to a lack of " +
                "self-confidence, and a general air of insecurity.\n" +
                "Your creative powers are at an all-time low,\nand " +
                "everything may seem pointless.\n\tTake this time " +
                "to reconnect with yourself and the universe.\n" +
                "Be nurturing towards yourself and those around you,\n" +
                "and allow your wounds to heal.";
        } // end of if/else
    } // end of getDescription method
} // end of TheMagician class