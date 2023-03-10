/*
 * This defines a class representing the tarot card, "The Chariot".
 * @author Brady Manske
 * @version 2023/01/22
 */
public class TheChariot extends Card {

    // Given a boolean representing card orientation,
    // constructs a The Chariot card
    public TheChariot(boolean upright) {
        this.upright = upright;
    } // end of constructor
    
    // Returns The Chariot's title and orientation
    public String toString() {
        String title = "The Chariot";
        if (!isUpright()) {
            title += " (Reversed)";
        } // end of if
        return title;
    } // end of toString method
    
    // Returns The Chariot's roman numeral
    public String getNumeral() {
        return "VII";
    } // end of getNumeral method
    
    // Returns a paragraph describing what
    // The Chariot means in relation to the user
    public String getDescription() {
        if (isUpright()) {
            return "\tIt’s time to scrape together your courage,\nand will " +
                "yourself forward in the direction of your choosing.\n" +
                "There may be conflicts and obstacles in your way,\nbut " +
                "with enough inner strength you will be able to steer " +
                "clear of any major disaster.\n\tThere are ebbs and flows " +
                "in life. Times of joy and of pain.\nThe Chariot is reminding " +
                "you to stick to your resolve,\nregardless of the " +
                "circumstances you may be facing.\nThis period will help you " +
                "grow spiritually and build your character.\nIf you manage " +
                "to control yourself with discipline and hard work,\ninstead " +
                "of succumbing to inner turmoil and the thrill of rushed " +
                "decisions,\nyou will succeed in reaching your " +
                "desired destination.";

        } else { // reversed description
            return "\tYou aren’t managing things very well at the moment.\n" +
                "Either you’ve lost control of a situation,\nor you’ve lost " +
                "the willpower to push through and reach your goal.\nEither " +
                "way, you are heading in the wrong direction at the moment,\n" +
                "so pushing ahead will only make you feel more lost.\nIt " +
                "might be best to just admit defeat and let things run " +
                "their course.\nTrying to get things back on track is " +
                "pointless.\n\tYou need to accept the way things are and " +
                "loosen your grip.\nWhile you’re taking a step back, make " +
                "an effort\nto learn from this failure.\nLearn to " +
                "align your motives with that of the Divine,\nand you will " +
                "find things run a lot smoother in future.";
        } // end of if/else
    } // end of getDescription method
} // end of TheChariot class
