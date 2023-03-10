/*
 * This defines a class representing the tarot card, "The Fool".
 * @author Brady Manske
 * @version 2023/01/22
 */
public class TheFool extends Card {

    // Given a boolean representing card orientation,
    // constructs a The Fool card
    public TheFool(boolean upright) {
        this.upright = upright;
    } // end of constructor
    
    // Returns The Fool's title and orientation
    public String toString() {
        String title = "The Fool";
        if (!isUpright()) {
            title += " (Reversed)";
        } // end of if
        return title;
    } // end of toString method
    
    // Returns a paragraph describing what
    // The Fool means in relation to the user
    public String getDescription() {
        if (isUpright()) {
            return "\tYou are embarking on a journey. This journey may be " +
                "physical, emotional or spiritual.\nIt is time for you to " +
                "explore the unknown and become wiser than you currently " +
                "are.\nIt is time to take a leap of faith and follow your " +
                "inner calling.\nEverything will fall into place, even if " +
                "your exact destination seems unclear at present.\n\tYou " +
                "have a lot going for you at this time, and now you must\n" +
                "get started on a new journey or chapter in your life.\n" +
                "You might not feel 100% ready, but that’s what taking a " +
                "leap of faith is all about.\nTrust in your own abilities " +
                "and you will reach your destination.";

        } else { // reversed description
            return "\tYou may have a need to start something new.\nIt is " +
                "important to understand that now is not the time.\nOther " +
                "things need to happen before you is ready to embark on " +
                "a new quest.\nYou are either afraid of starting something " +
                "new, or the timing is off.\n\tOn one hand, you may be " +
                "hesitant for a good reason.\nThere may be external " +
                "factors that are holding you back at this time,\nin " +
                "which case it would be wise to hold off on\nstarting " +
                "something new at this point.\n\tOn the other hand you " +
                "may be having an internal struggle.\nYou may be fearing " +
                "the worst, which is causing you to put your own dreams " +
                "on hold.\nIf this is the case, work on your confidence " +
                "and creativity.\nLet your inner child out to play a bit.\n\t" +
                "Whichever of these are the case, remember that you are " +
                "protected,\nbut the wisest choice at this time is to\n" +
                "start small and allow yourself to ease into this new " +
                "position.";
        } // end of if/else
    } // end of getDescription method
} // end of TheFool class
