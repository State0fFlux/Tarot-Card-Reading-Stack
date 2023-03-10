// Brady Manske
// 1/24/23
// CS&145
// Deck of Cards: Death

// This defines a class representing the tarot card, "Death"
public class Death extends Card {

    // Given a boolean representing card orientation,
    // constructs a Death card  
    public Death(boolean upright) {
        this.upright = upright;
    } // end of constructor
    
    // Returns Death's title and orientation
    public String toString() {
        String title = "Death";
        if (!isUpright()) {
            title += " (Reversed)";
        } // end of if
        return title;
    } // end of toString method
    
    // Returns Death's roman numeral
    public String getNumeral() {
        return "XIII";
    } // end of getNumeral method
    
    // Returns a paragraph describing what
    // Death means in relation to the user
    public String getDescription() {
        if (isUpright()) {
            return "\tThere is a big change looming on the horizon.\nThe Sun " +
                "is setting on a certain aspect of your life,\nand it’s time " +
                "to say goodbye.\nSomething is coming to an end and you are " +
                "helpless to stop it.\nIn fact you need to embrace this " +
                "change in your life in order to move on.\n\tA certain sense " +
                "of loss and grief may accompany this card.\nBut rest " +
                "assured,\nthings will start looking up again very soon.\n" +
                "Understand that something needs to give way in order to\n" +
                "make space for something new to start blooming in your life.";

        } else { // reversed description
            return "\tYou’ve become stagnant in a situation or " +
                "relationship.\nYou know it’s time to let go, but you’re " +
                "still clinging onto the attachment\nin hopes that it will " +
                "one day feel like it did in the past.\nThe truth of the " +
                "matter is that it won’t.\nLetting go of this unhealthy " +
                "attachment is the only way\nyou will be able to heal " +
                "yourself emotionally, physically and spiritually.\n\tIt may " +
                "be a prolonged process to let go,\nbut the Universe is " +
                "urging you to go ahead and cut old ties.";
        } // end of if/else
    } // end of getDescription method
} // end of Death class