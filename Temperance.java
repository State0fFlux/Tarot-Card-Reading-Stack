/*
 * This defines a class representing the tarot card, "Temperance".
 * @author Brady Manske
 * @version 2023/01/22
 */
public class Temperance extends Card {

    // Given a boolean representing card orientation,
    // constructs a Temperance card  
    public Temperance(boolean upright) {
        this.upright = upright;
    } // end of constructor
    
    // Returns Temperance's title and orientation
    public String toString() {
        String title = "Temperance";
        if (!isUpright()) {
            title += " (Reversed)";
        } // end of if
        return title;
    } // end of toString method
    
    // Returns Temperance's roman numeral
    public String getNumeral() {
        return "XIV";
    } // end of getNumeral method
    
    // Returns a paragraph describing what
    // Temperance means in relation to the user
    public String getDescription() {
        if (isUpright()) {
            return "\tYou have felt the pain of loss, but you have also " +
                "seen\nwhy some things need to come to an end.\nWith this " +
                "knowledge you are now able to balance your life more.\n" +
                "You understand the natural rhythms of life and the necessity " +
                "to\nlet some things go in order to make space for other things " +
                "to flourish.\n\tThis is the time to go with the flow of life and " +
                "accept whatever you cannot change.\nRemaining even-tempered " +
                "and stable is your best bet at making progress in life.\n" +
                "Don’t let the little things perturb you;\nYou will find " +
                "fulfillment as long as you keep your temper in check,\nand " +
                "allow life to flow as it should.";

        } else { // reversed description
            return "\tThere is a part of your life that is out of balance.\n" +
                "You’re neglecting one aspect while indulging in another.\n" +
                "You need to control your emotions and urges,\nbefore things " +
                "get completely out of control,\nand you’re swept up in " +
                "something that doesn’t serve your greater purpose.\n\tIn " +
                "order to realign yourself with your higher purpose,\ntake " +
                "the time to locate the source of this imbalance.\nYou may " +
                "need to make some changes in your life in order to\nprevent " +
                "a negative cycle from taking hold completely.";
        } // end of if/else
    } // end of getDescription method
} // end of Temperance class
