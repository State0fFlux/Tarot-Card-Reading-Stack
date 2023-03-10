// Brady Manske
// 1/24/23
// CS&145
// Deck of Cards: The Hermit

// This defines a class representing the tarot card, "The Hermit"
public class TheHermit extends Card {

    // Given a boolean representing card orientation,
    // constructs a The Hermit card
    public TheHermit(boolean upright) {
        this.upright = upright;
    } // end of constructor
    
    // Returns The Hermit's title and orientation
    public String toString() {
        String title = "The Hermit";
        if (!isUpright()) {
            title += " (Reversed)";
        } // end of if
        return title;
    } // end of toString method
    
    // Returns The Hermit's roman numeral
    public String getNumeral() {
        return "IX";
    } // end of getNumeral method
    
    // Returns a paragraph describing what
    // The Hermit means in relation to the user
    public String getDescription() {
        if (isUpright()) {
            return "\tIt’s time to take a break from the people around you,\n" +
                "and focus on your inner self. You carry all the wisdom " +
                "you need within,\nand if you remain engaged in the " +
                "external world at this time,\nothers may lead you astray.\n" +
                "There are still some things you need to tend to within,\n" +
                "but with self-knowledge comes great wisdom.\n\tYou now have " +
                "the opportunity to retreat\nfrom the external world and " +
                "focus on yourself.\nIn this repose you will find the " +
                "answers you seek.\nYou will learn to follow your inner " +
                "guiding light, and make decisions that will take you\n" +
                "further in life than decisions based on the ideas of others.";

        } else { // reversed description
            return "\tThe universe senses that you are struggling\nto balance " +
            "your own introspection with those around you.\nYou may be " +
            "neglecting your spirit, and as a result\nyou have become " +
            "dishonest and mischievous\nas you search for ways to express " +
            "your true self.\nThis may start happening on a subconscious " +
            "level.\nConsciously, you may be feeling frustration and " +
            "resentment towards others.\n\tAlternatively, your obsession " +
            "with your own thoughts may cause you to\nwithdraw from " +
            "society. You have lost touch with the real world, and\nas a " +
            "result you find yourself fearing it.\nYou will be constantly " +
            "vigilant, expecting the worst.\nMaking a conscious effort to " +
            "balance your interactions\nwith yourself and with those around " +
            "you will be very important here.";
        } // end of if/else
    } // end of getDescription method
} // end of TheHermit class