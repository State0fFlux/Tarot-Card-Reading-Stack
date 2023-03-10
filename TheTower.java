// Brady Manske
// 1/24/23
// CS&145
// Deck of Cards: The Tower

// This defines a class representing the tarot card, "The Tower"
public class TheTower extends Card {

    // Given a boolean representing card orientation,
    // constructs a The Tower card  
    public TheTower(boolean upright) {
        this.upright = upright;
    } // end of constructor
    
    // Returns The Tower's title and orientation
    public String toString() {
        String title = "The Tower";
        if (!isUpright()) {
            title += " (Reversed)";
        } // end of if
        return title;
    } // end of toString method
    
    // Returns The Tower's roman numeral
    public String getNumeral() {
        return "XVI";
    } // end of getNumeral method
    
    // Returns a paragraph describing what
    // The Tower means in relation to the user
    public String getDescription() {
        if (isUpright()) {
            return "\tIt may feel like your entire life is crumbling around " +
                "you.\nYou’ve worked so hard and now everything is falling " +
                "apart.\nYou might be wondering what you’ve done to deserve " +
                "this, but soon you will realise\nthat the life you have " +
                "built was destined to crumble at some point.\nYour " +
                "foundations are weak. You neglect to see the truth of the " +
                "situation.\n\tLuckily your illusions have been shattered.\n" +
                "This upcoming period may feel chaotic as you struggle to " +
                "rebuild yourself.\nEmbrace this blank slate as an " +
                "opportunity to build from a stronger foundation.";

        } else { // reversed description
            return "\tYou are busy testing the world around you,\nand as a " +
            "result it is making you feel like a prisoner in your own " +
            "life.\nHowever, you need to realise that it is\nyour own mind " +
            "that is making you feel trapped.\n\tOn the other hand, you " +
            "might think that you are\nsafe in the tower you’ve built for " +
            "yourself.\nEventually you will need to face the changes in " +
            "your life.\nBy refusing to acknowledge the changes that are " +
            "happening,\nyou become your own captor.\nThe only constant " +
            "in life is change, and now is the time to embrace it.";
        } // end of if/else
    } // end of getDescription method
} // end of TheTower class