// Brady Manske
// 1/24/23
// CS&145
// Deck of Cards: The Moon

// This defines a class representing the tarot card, "The Moon"
public class TheMoon extends Card {

    // Given a boolean representing card orientation,
    // constructs a The Moon card  
    public TheMoon(boolean upright) {
        this.upright = upright;
    } // end of constructor
    
    // Returns The Moon's title and orientation
    public String toString() {
        String title = "The Moon";
        if (!isUpright()) {
            title += " (Reversed)";
        } // end of if
        return title;
    } // end of toString method
    
    // Returns The Moon's roman numeral
    public String getNumeral() {
        return "XVIII";
    } // end of getNumeral method
    
    // Returns a paragraph describing what
    // The Moon means in relation to the user
    public String getDescription() {
        if (isUpright()) {
            return "\tThere is something buried deep in your subconscious,\n" +
                "that is affecting your life at present.\nIt is causing you " +
                "to be afraid of progress.\nThere may be a past trauma " +
                "that has not been resolved yet. By bottling up these " +
                "emotions,\nyou have formed thought patterns and behaviours " +
                "that help you avoid similar situations.\n\tYou need to " +
                "delve into your subconscious and unearth the source of your " +
                "current fears.\nThey are dimming your light and holding you " +
                "back from living life to its full potential.\nDon’t fool " +
                "yourself into thinking that you have reached your limits.\n" +
                "With a bit of introspection, the path to true enlightenment " +
                "will become as clear as day.";

        } else { // reversed description
            return "\tYou have made some mistakes. You know this by now.\n" +
            "However things are changing for you, internally.\nYou can " +
            "expect a period of silence,\nduring which you will consider these " +
            "changes.\n\tThings may not be completely clear yet,\nso use this " +
            "period to deeply reflect.\nIn time, you will find the clarity " +
            "that is currently lacking.";
        } // end of if/else
    } // end of getDescription method
} // end of TheMoon class