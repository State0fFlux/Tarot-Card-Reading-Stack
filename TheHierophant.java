/*
 * This defines a class representing the tarot card, "The Hierophant".
 * @author Brady Manske
 * @version 2023/01/22
 */
public class TheHierophant extends Card {

    // Given a boolean representing card orientation,
    // constructs a The Hierophant card
    public TheHierophant(boolean upright) {
        this.upright = upright;
    } // end of constructor
    
    // Returns The Hierophant's title and orientation
    public String toString() {
        String title = "The Hierophant";
        if (!isUpright()) {
            title += " (Reversed)";
        } // end of if
        return title;
    } // end of toString method
    
    // Returns The Hierophant's roman numeral
    public String getNumeral() {
        return "V";
    } // end of getNumeral method
    
    // Returns a paragraph describing what
    // The Hierophant means in relation to the user
    public String getDescription() {
        if (isUpright()) {
            return "\tYou may feel drawn to certain organized religions " +
                "or spiritual practices.\nYou feel drawn to " +
                "the structure and conformity of the idea or practice.\n" +
                "The Hierophant supports this new interest of yours,\nas " +
                "its structure will provide you great comfort and a " +
                "sense of belonging.\nDo not be afraid of conformity.";
                
        } else { // reversed description
            return "\tThe reversed Hierophant is challenging your beliefs.\n" +
            "The rules of the World that once seemed normal are beginning to " +
            "confuse you.\nYou are transitioning into new schools of " +
            "thought, and you wonder\n whether conformity is meant for you.\n\t" +
            "But while you’re challenging the beliefs of others, you need to\n" +
            "understand that these people have " +
            "built their lives\non the very beliefs you are challenging.\n" +
            "You may experience dissonance with those close to you " +
            "during this period.\nBe mindful of these relations, as you " +
            "tread on unstable ground.";
        } // end of if/else
    } // end of getDescription method
} // end of TheHierophant class
