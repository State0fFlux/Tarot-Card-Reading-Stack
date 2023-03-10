// Brady Manske
// 1/24/23
// CS&145
// Deck of Cards: Strength

// This defines a class representing the tarot card, "Strength"
public class Strength extends Card {

    // Given a boolean representing card orientation,
    // constructs a Strength card
    public Strength(boolean upright) {
        this.upright = upright;
    } // end of constructor
    
    // Returns Strength's title and orientation
    public String toString() {
        String title = "Strength";
        if (!isUpright()) {
            title += " (Reversed)";
        } // end of if
        return title;
    } // end of toString method
    
    // Returns Strength's roman numeral
    public String getNumeral() {
        return "VIII";
    } // end of getNumeral method
    
    // Returns a paragraph describing what
    // Strength means in relation to the user
    public String getDescription() {
        if (isUpright()) {
            return "\tYou have faced struggles.\nHowever, instead of letting " +
                "them get you down,\nyou have learned from them and pushed " +
                "through.\nYou have built up a spiritual stamina.\nYou " +
                "understand that life has its ups and downs,\nand you’re not " +
                "letting the tough times steer you off course any more.\n" +
                "You are filled with the power and energy to push through,\n" +
                "and reach the goals you are determined to reach.\nYou don’t " +
                "need to express your power in a negative way.\n\tWith this " +
                "inner strength comes the wisdom and control of emotions.\n" +
                "You realize which things are out of your control,\nand you " +
                "don’t struggle with letting them go.\nYou know where to " +
                "focus your energy\nto get to where you want to be\nwithout " +
                "causing conflict.";

        } else { // reversed description
            return "\tYou may be feeling drained at the moment,\nlike life " +
            "has sapped all your energy.\nThis does not mean you have to " +
            "give up.\nIt’s time to focus on yourself and look after your " +
            "own needs.\nIf you don’t, this vulnerable feeling may cause " +
            "you to lash out.\n\tNow is the time to balance your inner " +
            "energies,\nand maintain an equilibrium.\nFeel free to take a " +
            "step back and reevaluate your internal world.\nYour inner " +
            "strength is out of balance,\nand only you know what needs " +
            "to be done to restore your vitality.";
        } // end of if/else
    } // end of getDescription method
} // end of Strength class