// Brady Manske
// 1/24/23
// CS&145
// Deck of Cards: The Sun

// This defines a class representing the tarot card, "The Sun"
public class TheSun extends Card {

    // Given a boolean representing card orientation,
    // constructs a The Sun card  
    public TheSun(boolean upright) {
        this.upright = upright;
    } // end of constructor
    
    // Returns The Sun's title and orientation
    public String toString() {
        String title = "The Sun";
        if (!isUpright()) {
            title += " (Reversed)";
        } // end of if
        return title;
    } // end of toString method
    
    // Returns The Sun's roman numeral
    public String getNumeral() {
        return "XIX";
    } // end of getNumeral method
    
    // Returns a paragraph describing what
    // The Sun means in relation to the user
    public String getDescription() {
        if (isUpright()) {
            return "\tYou are in a state of complete bliss.\nThe " +
                "responsibilities of life no longer bog you down.\nEnjoy " +
                "this period, and remember how hard you have worked to get " +
                "here.\nYou are relishing in nothing less than the results " +
                "of all your hard work.\nAllow the love that you are " +
                "currently feeling to exude into your personal " +
                "relationships.\nLet those that you care about feel the " +
                "warmth of your Sun.\n\tThere is a chance that you are not " +
                "yet feeling the power of the Sun.\nDon't worry, as the " +
                "darkness will dissipate soon.\nWhen it does, nothing will " +
                "stand in your way.\nThe illuminating Sun is on your side.";

        } else { // reversed description
            return "\tYou are reaching all of your goals, but it is\nas " +
                "though something is still missing.\nYou remain unfulfilled " +
                "on a spiritual level.\nUnderstand that you have every right " +
                "to celebrate your achievements.\nYou have worked hard and " +
                "accomplished great things.\nNow it is time to free yourself " +
                "from these goals for a while,\nand allow your spirit to " +
                "rest.\n\tLet your inner child come out to play.\nFree up " +
                "your creativity and express the emotions\nthat are hiding " +
                "just beneath the surface.\nTake the time to pause and " +
                "embrace the beauty of life.";
        } // end of if/else
    } // end of getDescription method
} // end of TheSun class