// Brady Manske
// 1/24/23
// CS&145
// Deck of Cards: The Lovers

// This defines a class representing the tarot card, "The Lovers"
public class TheLovers extends Card {

    // Given a boolean representing card orientation,
    // constructs a The Lovers card
    public TheLovers(boolean upright) {
        this.upright = upright;
    } // end of constructor
    
    // Returns The Lovers's title and orientation
    public String toString() {
        String title = "The Lovers";
        if (!isUpright()) {
            title += " (Reversed)";
        } // end of if
        return title;
    } // end of toString method
    
    // Returns The Lovers's roman numeral
    public String getNumeral() {
        return "VI";
    } // end of getNumeral method
    
    // Returns a paragraph describing what
    // The Lovers means in relation to the user
    public String getDescription() {
        if (isUpright()) {
            return "\tYou’re seeing things differently.\nThere is a " +
                "stirring inside you and you don’t quite know what it is.\n" +
                "You feel naked and you see the vulnerability of those " +
                "around you.\nThis stirs a deep connection between yourself " +
                "and others.\nIt is in this connection that you find beauty " +
                "and healing.\nEverything is flowing harmoniously and " +
                "choices are easy to make\nas long as you follow your " +
                "spiritual flame.\n\tYou feel optimistic about the future. " +
                "Everything is looking beautiful.\nYou find it easy to " +
                "turn your back on temptation\nand focus on the Divine " +
                "nature of being human.\nWith this feeling of connection, " +
                "healing will take place easily and on a deep level.";

        } else { // reversed description
            return "\tYou feel out of sync with the world.\nThe connection " +
                "between you and others is faltering.\nYou are frustrated " +
                "that you can’t seem to get through to your loved ones,\n" +
                "and this is causing an array of negative emotions for " +
                "you.\nYour emotions may push you to make regretful " +
                "decisions\n\tDon’t lose hope, as this disconnect will not last " +
                "forever.\nBut now is the time to choose whether what you " +
                "desire is worth the effort,\nor whether you should try " +
                "something else.\nWeigh your options carefully, as your " +
                "choices\nduring this period are extremely impactful.";
        } // end of if/else
    } // end of getDescription method
} // end of TheLovers class