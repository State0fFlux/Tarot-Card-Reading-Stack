// Brady Manske
// 1/24/23
// CS&145
// Deck of Cards: The Emperor

// This defines a class representing the tarot card, "The Emperor"
public class TheEmperor extends Card {

    // Given a boolean representing card orientation,
    // constructs a The Emperor card
    public TheEmperor(boolean upright) {
        this.upright = upright;
    } // end of constructor
    
    // Returns The Emperor's title and orientation
    public String toString() {
        String title = "The Emperor";
        if (!isUpright()) {
            title += " (Reversed)";
        } // end of if
        return title;
    } // end of toString method
    
    // Returns 's roman numeral
    public String getNumeral() {
        return "IV";
    } // end of getNumeral method
    
    // Returns a paragraph describing what
    // The Emperor means in relation to the user
    public String getDescription() {
        if (isUpright()) {
            return "\tYou may feel forced to act as a leader in your " +
                "family.\nYou feel a great responsibility to provide for " +
                "your loved ones,\nThis could put a lot of pressure on you,\n" +
                "but you will live up to the demands of the task.\nIt’s your " +
                "job to make sure everything runs smoothly,\nand your " +
                "foundations remain solid.\nDuring this time you may feel " +
                "disconnected with your emotional spirit,\n" +
                "but that isn’t necessarily out of cold-heartedness.\n\t" +
                "Alternatively The Emperor could suggest that there is\n" +
                "someone in your life who is governing you.\nAn " +
                "authority figure that may seem quite harsh at times.\n" +
                "Understand that this person only has the best for you at " +
                "heart.\nEmbrace their tough love, and accept what they " + 
                "have to offer.\nThere is a lot that you can learn from " +
                "this person.";

        } else { // reversed description
            return "\tYou have become egotistical and drunk with power.\n" +
                "You want things done your way, or there will be " +
                "consequences,\nand those consequences will be severe.\n" +
                "Instead of being diplomatic, you are dominating and " +
                "aggressive.\nYou are ruling with fear instead of mutual " +
                "respect.\nYou lack the maturity to connect with others,\n" +
                "and persuade them in a respectful manner.\nYour " +
                "immobility in certain areas is creating\nobstructions for " +
                "those who are under your care.\n\tYou need to ease yourself " +
                "and connect with your nurturing spirit.\nAlternatively, " +
                "someone in your life may be\naffecting you with their cruel " +
                "behavior.\nIn this case, it is important to remember the " +
                "human behind the monster.\nThey may not understand the " +
                "hurt they are causing you.";
        } // end of if/else
    } // end of getDescription method
} // end of TheEmperor class