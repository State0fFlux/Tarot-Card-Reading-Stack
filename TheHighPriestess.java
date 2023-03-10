// Brady Manske
// 1/24/23
// CS&145
// Deck of Cards: The High Priestess

// This defines a class representing the tarot card, "The High Priestess"
public class TheHighPriestess extends Card {

    // Given a boolean representing card orientation,
    // constructs a The High Priestess card
    public TheHighPriestess(boolean upright) {
        this.upright = upright;
    } // end of constructor
    
    // Returns The High Priestess's title and orientation
    public String toString() {
        String title = "The High Priestess";
        if (!isUpright()) {
            title += " (Reversed)";
        } // end of if
        return title;
    } // end of toString method
    
    // Returns The High Priestess's roman numeral
    public String getNumeral() {
        return "II";
    } // end of getNumeral method
    
    // Returns a paragraph describing what
    // The High Priestess means in relation to the user
    public String getDescription() {
        if (isUpright()) {
            return "\tYou may feel as though you are learning something,\n" +
                "gaining from an experience,\nbut you can’t seem to " +
                "explain how or why this is happening.\nThis is your " +
                "subconscious energies coming to light.\n" +
                "You are more connected to your intuition and inner " +
                "wisdom than usual.\n\tIf you’re looking for answers, " +
                "The High Priestess is a reminder that \neverything you " +
                "seek can be found within.\nShe urges you to take time out " +
                "for yourself and\nreconnect with your mind and spirit.\n" +
                "Build yourself a sacred space, and allow yourself to\n" +
                "indulge in the mystery of the Cosmos.";

        } else { // reversed description
            return "\tYou may be feeling as though other people know " +
            "better than you do\nand, as a result, you’re being swept " +
            "along the river of their lives\ninstead of following your " +
            "own course.\nThis can be frustrating and cause you to act " +
            "out of bitterness,\nmaking you more selfish in certain areas " +
            "than usual.\n\tAnother result of ignoring your intuition " +
            "could be misunderstandings.\nIf you neglect your deeper " +
            "Knowledge, you act out of ignorance.\nThese shallow " +
            "responses may lead to upheaval if you are not careful.";
        } // end of if/else
    } // end of getDescription method
} // end of The High Priestess class