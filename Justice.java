/*
 * This defines a class representing the tarot card, "Justice"
 * @author Brady Manske
 * @version 2023/01/22
 */
public class Justice extends Card {

    // Given a boolean representing card orientation,
    // constructs a Justice card
    public Justice(boolean upright) {
        this.upright = upright;
    } // end of constructor
    
    // Returns Justice's title and orientation
    public String toString() {
        String title = "Justice";
        if (!isUpright()) {
            title += " (Reversed)";
        } // end of if
        return title;
    } // end of toString method
    
    // Returns Justice's roman numeral
    public String getNumeral() {
        return "XI";
    } // end of getNumeral method
    
    // Returns a paragraph describing what
    // Justice means in relation to the user
    public String getDescription() {
        if (isUpright()) {
            return "\tIt’s time to stop and reflect on your actions. What " +
                "path have you been taking?\nHave you been following your " +
                "head or your heart blindly, ignoring the other,\nin hopes " +
                "that you will get what you want..?\nJustice is letting you " +
                "know that you’re about to get what you deserve.\n\tDo not " +
                "fear. This will be a period of learning for you.\nIf you " +
                "feel like life is handing you a bad hand at the moment,\n" +
                "look at what you have done in the past.\nWhat has led to " +
                "the events that are currently transpiring in your life?\n" +
                "It’s time to start balancing your actions and keeping\nthe " +
                "consequences of your actions in mind.";

        } else { // reversed description
            return "\tYou’ve done something you’re not proud of.\nYou may be " +
            "experiencing an internal struggle during this period,\nas a result " +
            "of your looming guilt.\nYou may be blaming yourself unfairly.\n" +
            "You feel you could have done better,\nbut you have a tendency to " +
            "be too harsh on yourself.\nYou have find a way to relieve yourself " +
            "of this guilt.\n\tMaintain balance during this time,\nand don’t let " +
            "your inner conflict get to a point where\nit affects your " +
            "relationships with\nfalse accusations and emotional outbursts.\n" +
            "Be aware of how your actions influence the world around you.";
        } // end of if/else
    } // end of getDescription method
} // end of Justice class
