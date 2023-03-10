/*
 * This defines a class representing the tarot card, "The Wheel of Fortune".
 * @author Brady Manske
 * @version 2023/01/22
 */
public class TheWheelOfFortune extends Card {

    // Given a boolean representing card orientation,
    // constructs a The Wheel of Fortune card
    public TheWheelOfFortune(boolean upright) {
        this.upright = upright;
    } // end of constructor
    
    // Returns The Wheel of Fortune's title and orientation
    public String toString() {
        String title = "The Wheel of Fortune";
        if (!isUpright()) {
            title += " (Reversed)";
        } // end of if
        return title;
    } // end of toString method
    
    // Returns The Wheel of Fortune's roman numeral
    public String getNumeral() {
        return "X";
    } // end of getNumeral method
    
    // Returns a paragraph describing what
    // The Wheel of Fortune means in relation to the user
    public String getDescription() {
        if (isUpright()) {
            return "\tYou are putting a lot of powerful energy out into the " +
                "World.\nRest easy knowing that your efforts will pay off.\n" +
                "The energy that you are investing into the world\nwill " +
                "eventually make its way back to you.\n\tHowever, be aware " +
                "of what you are putting out into the Universe.\n" +
                "Negative energy will also find its way back to " +
                "you,\nif it is all that you contribute to the World around you.";

        } else { // reversed description
            return "\tYou may experience financial changes,\nwhich will put " +
            "you in a much better position.\nHowever, it is vital to take " +
            "things as they come,\nand embrace these changes with open arms.\n" +
            "The Wheel of Fortune reversed implies that you may be\n" +
            "resisting changes that are actively occuring in your life.\n" +
            "This can lead to many missed opportunities,\nespecially in " +
            "the financial sphere of your life.\n\tSo, make sure you’re " +
            "not subconsciously sabotaging\nyour chances for success " +
            "and superfluity.";
        } // end of if/else
    } // end of getDescription method
} // end of TheWheelOfFortune class
