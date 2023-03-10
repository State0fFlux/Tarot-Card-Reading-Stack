// Brady Manske
// 1/24/23
// CS&145
// Deck of Cards: Judgement

// This defines a class representing the tarot card, ""
public class Judgement extends Card {

    // Given a boolean representing card orientation,
    // constructs a Judgement card  
    public Judgement(boolean upright) {
        this.upright = upright;
    } // end of constructor
    
    // Returns Judgement's title and orientation
    public String toString() {
        String title = "Judgement";
        if (!isUpright()) {
            title += " (Reversed)";
        } // end of if
        return title;
    } // end of toString method
    
    // Returns Judgement's roman numeral
    public String getNumeral() {
        return "XX";
    } // end of getNumeral method
    
    // Returns a paragraph describing what
    // Judgement means in relation to the user
    public String getDescription() {
        if (isUpright()) {
            return "\tEverything has been going well, and you are happy with " +
                "how far you have come.\nHowever, this is not the end of the " +
                "road.\nYou are about to enter a new phase of existence.\n" +
                "You will need to follow your intuition in order to make the " +
                "most of it,\nbut through this process you will gain a " +
                "renewed sense of self.\n\tAll judgement will fall away once " +
                "you enter this higher state.\nTake this opportunity to " +
                "elevate yourself. Trust your judgments,\nand enjoy the " +
                "new World that awaits you.";

        } else { // reversed description
            return "\tYou are having difficulty seeing the light within " +
                "yourself.\nYou are being overly critical, focusing on\nyour " +
                "mistakes and imperfections.\nIn judging yourself so " +
                "harshly, you are\nrobbing yourself of the gift of " +
                "experience.\nYou need to instead reflect on your past " +
                "mistakes.\n\tDon’t let doubt and worry cause you to fail.\n" +
                "Make peace with the past and move on.\nThere are greater " +
                "things in store for you,\nif you take this time to learn " +
                "from past mistakes,\nand let go of any negative judgements\n" +
                "that you have regarding them.";
        } // end of if/else
    } // end of getDescription method
} // end of Judgement class