/*
 * This defines a class representing the tarot card, "The Hanged Man".
 * @author Brady Manske
 * @version 2023/01/22
 */
public class TheHangedMan extends Card {

    // Given a boolean representing card orientation,
    // constructs a The Hanged Man card  
    public TheHangedMan(boolean upright) {
        this.upright = upright;
    } // end of constructor
    
    // Returns The Hanged Man's title and orientation
    public String toString() {
        String title = "The Hanged Man";
        if (!isUpright()) {
            title += " (Reversed)";
        } // end of if
        return title;
    } // end of toString method
    
    // Returns The Hanged Man's roman numeral
    public String getNumeral() {
        return "XII";
    } // end of getNumeral method
    
    // Returns a paragraph describing what
    // The Hanged Man means in relation to the user
    public String getDescription() {
        if (isUpright()) {
            return "\tThe Universe senses that you need a break.\nSometimes " +
                "it’s good to take a moment to stand still,\nand observe " +
                "what’s happening around you.\nLooking at things from a " +
                "different perspective can help you\nrealise what hidden " +
                "opportunities you’ve been overlooking.\n\tIt is easy to " +
                "become mired in the monotony of everyday life, and\n" +
                "as a result you may be overlooking some amazing " +
                "opportunities.\nWhile you’re taking a break, make a point " +
                "of\nlooking at things from a different perspective.\nYou " +
                "will find that things begin to make sense\nwhen you change " +
                "the way that you view them.";

        } else { // reversed description
            return "\tYou’re either refusing to stop or you struggle to move " +
                "forward.\nEither way, you need to break out of this cycle.\n\t" +
                "If you’re stuck, try getting a different perspective.\nGo " +
                "somewhere different, do something out of the ordinary.\nIt " +
                "will help unleash your creativity and give you some " +
                "inspiration.";
        } // end of if/else
    } // end of getDescription method
} // end of TheHangedMan class
