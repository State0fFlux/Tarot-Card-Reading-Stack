// Brady Manske
// 1/24/23
// CS&145
// Deck of Cards: The Star

// This defines a class representing the tarot card, "The Star"
public class TheStar extends Card {

    // Given a boolean representing card orientation,
    // constructs a The Star card  
    public TheStar(boolean upright) {
        this.upright = upright;
    } // end of constructor
    
    // Returns The Star's title and orientation
    public String toString() {
        String title = "The Star";
        if (!isUpright()) {
            title += " (Reversed)";
        } // end of if
        return title;
    } // end of toString method
    
    // Returns The Star's roman numeral
    public String getNumeral() {
        return "XVII";
    } // end of getNumeral method
    
    // Returns a paragraph describing what
    // The Star means in relation to the user
    public String getDescription() {
        if (isUpright()) {
            return "\tYou are finally standing in the nakedness of your " +
                "truth.\nWhile this may make you feel vulnerable at times, " +
                "remember that\nyou are serving your highest purpose by " +
                "letting your energy flow through you.\nYou’ve undergone a " +
                "rough period, but you have emerged wiser and stronger.\nYou " +
                "are ready to embrace all that you are and fulfill your " +
                "destiny.\nYou are the magic in the world, and you have the " +
                "power to leave an imprint on it.\n\tFollow your dreams.\nLet " +
                "your intuition guide you like a Star " +
                "through the darkness.";

        } else { // reversed description
            return "\tYour depressed spirit is the only thing standing in " +
            "your way.\nYour current insecurity is as a\nresult of past " +
            "arrogance and self-involvement.\nYou thought you could achieve " +
            "it all without anyone else,\nbut you were wrong and now you are " +
            "paying the price.\nThis imbalance has caused you to lose " +
            "faith in your own abilities,\nand as a result you find yourself " +
            "alone.\n\tYou need to rebuild your self-respect,\nand respect " +
            "others enough to realise their worth.\nYou have depleted your " +
            "reserves, and now it is time\nto begin nurturing yourself and " +
            "your life back to health.";
        } // end of if/else
    } // end of getDescription method
} // end of TheStar class