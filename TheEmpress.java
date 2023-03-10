// Brady Manske
// 1/24/23
// CS&145
// Deck of Cards: The Empress

// This defines a class representing the tarot card, "The Empress"
public class TheEmpress extends Card {

    // Given a boolean representing card orientation,
    // constructs a The Empress card
    public TheEmpress(boolean upright) {
        this.upright = upright;
    } // end of constructor
    
    // Returns The Empress's title and orientation
    public String toString() {
        String title = "The Empress";
        if (!isUpright()) {
            title += " (Reversed)";
        } // end of if
        return title;
    } // end of toString method
    
    // Returns The Empress's roman numeral
    public String getNumeral() {
        return "III";
    } // end of getNumeral method
    
    // Returns a paragraph describing what
    // The Empress means in relation to the user
    public String getDescription() {
        if (isUpright()) {
            return "\tThe Cards are indicating that it may be time for you " +
            "to\nstart creating something. The abundant energies of " +
            "The Empress are on your side.\nAnything you put your hands to " +
            "at this time is sure to bring you joy and fulfillment.\n\t" +
            "There is also a strong urge to nurture associated with " +
            "The Empress.\nYou may want to nurture your soul by connecting " +
            "with the Earth.\nThe Empress encourages you to share your " +
            "nurturing energy with the World around you.";

        } else { // reversed description
            return "\tYou may be feeling blocked off from your creative " +
            "energy.\nTake some time to nurture yourself and reconnect " +
            "with nature.\n\tAllow your creative energies to replenish.\n" +
            "The Empress reversed suggests that you may be mothering others,\n" +
            "and not paying enough attention to yourself.\nIn this case, " +
            "it may be beneficial to take a step back,\nand direct your focus " +
            "upon yourself.";
        } // end of if/else
    } // end of getDescription method
} // end of TheEmpress class