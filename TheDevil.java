/*
 * This defines a class representing the tarot card, "The Devil".
 * @author Brady Manske
 * @version 2023/01/22
 */
public class TheDevil extends Card {

    // Given a boolean representing card orientation,
    // constructs a The Devil card  
    public TheDevil(boolean upright) {
        this.upright = upright;
    } // end of constructor
    
    // Returns The Devil's title and orientation
    public String toString() {
        String title = "The Devil";
        if (!isUpright()) {
            title += " (Reversed)";
        } // end of if
        return title;
    } // end of toString method
    
    // Returns The Devil's roman numeral
    public String getNumeral() {
        return "XV";
    } // end of getNumeral method
    
    // Returns a paragraph describing what
    // The Devil means in relation to the user
    public String getDescription() {
        if (isUpright()) {
            return "\tYou may feel caught up in a situation that is " +
                "corrupting your spirit.\nResist the urge to act on " +
                "impulsions and entertain an ill-tempered nature.\nYou are " +
                "better than your dark shadow.\nWith some effort you will " +
                "overcome the illusion that you need to submit to this " +
                "Evil.\nIt’s time to break the chains and take control of " +
                "your destiny.\n\tYour shadow will always be there, but " +
                "that doesn’t mean you should\nallow it to hold you back.\n" +
                "Rather, look at this aspect of yourself as a guide to what " +
                "not to do.\nBy working with your dark shadow in this way, " +
                "you will be able to\nrestore harmony and balance in your " +
                "life.\nDenying your shadow will only feed its power.";

        } else { // reversed description
            return "\tYou are on the brink of a period of success and " +
                "growth.\nHowever, you first need to escape the cages " +
                "that are holding you back.\nThis might mean putting an " +
                "end to an unhealthy relationship or behaviour\nthat " +
                "doesn’t serve your higher self.\nIf you have been acting " +
                "out of fear, confront this fear of yours.\nYour potential " +
                "is being blocked by your belief\nthat you are incapable of " +
                "achieving your goals alone.\n\tYou are holding yourself back " +
                "by\nallowing your insecurity to determine your future.\nOnly " +
                "by expressing your inner desires and facing your fears,\n" +
                "will you be able to take charge of your destiny once more.";
        } // end of if/else
    } // end of getDescription method
} // end of TheDevil class
