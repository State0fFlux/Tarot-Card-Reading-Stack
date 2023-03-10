/*
 * This program will conduct tarot readings
 * oriented around a user's past, present, and future.
 * @author Brady Manske
 * @version 2023/01/22
 */

import java.util.*; // for Scanner, Random, & Queue

public class TarotReading {

    public static void main(String[] args) {
        // initializing variables & objects
        char response = 'x';
        boolean again = false;
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        String name = intro(scanner);
        Queue<Card> deck = new LinkedList<Card>();
        
        do { // rereads user's tarot, if user requests
            deck = shuffleDeck(random);
            reading(deck, name, scanner);
            do { // ensures user input is a yes or no
                System.out.println();
                System.out.print("Are you satisfied with your reading? ");
                response = scanner.next().toLowerCase().charAt(0);
                System.out.println();
                switch (response) {
                    case 'y':
                        System.out.println("Wonderful. Thank you, " + name +
                             ", for letting me read your fortune.");
                        again = false;
                        break;
                    case 'n':
                        again = true;
                        System.out.println("I am sorry to hear that, " + name +
                            ".\nAllow me to shuffle the deck and try again.");
                        break;
                    default:
                        System.out.println("I don't understand. " +
                            "Please respond with 'yes' or 'no'.");
                } // end of switch
                scanner.nextLine(); // carriage return
            } while (response != 'y' && response != 'n');
            System.out.println();
        } while (again);
    } // end of main method
    
    // Given a scanner for user input,
    // Introduces the rules of the reading to the user,
    // and returns the name of the user.
    public static String intro(Scanner scanner) {
        System.out.println("This program will read your tarot " +
            "fortune for you.\nBefore we get started,");
        System.out.print("What is your name? ");
        return scanner.nextLine();
    } // end of intro method
    
    // Given a random number generator,
    // Shuffles a deck of the 22 major arcana tarot cards
    // and returns the shuffled deck
    public static Queue<Card> shuffleDeck(Random random) {
        // creating unshuffled deck
        List<Card> unshuffled = new ArrayList<>();
        unshuffled.add(new TheFool(random.nextBoolean()));
        unshuffled.add(new TheMagician(random.nextBoolean()));
        unshuffled.add(new TheHighPriestess(random.nextBoolean()));
        unshuffled.add(new TheEmpress(random.nextBoolean()));
        unshuffled.add(new TheEmperor(random.nextBoolean()));
        unshuffled.add(new TheHierophant(random.nextBoolean()));
        unshuffled.add(new TheLovers(random.nextBoolean()));
        unshuffled.add(new TheChariot(random.nextBoolean()));
        unshuffled.add(new Strength(random.nextBoolean()));
        unshuffled.add(new TheHermit(random.nextBoolean()));
        unshuffled.add(new TheWheelOfFortune(random.nextBoolean()));
        unshuffled.add(new Justice(random.nextBoolean()));
        unshuffled.add(new TheHangedMan(random.nextBoolean()));
        unshuffled.add(new Death(random.nextBoolean()));
        unshuffled.add(new Temperance(random.nextBoolean()));
        unshuffled.add(new TheDevil(random.nextBoolean()));
        unshuffled.add(new TheTower(random.nextBoolean()));
        unshuffled.add(new TheStar(random.nextBoolean()));
        unshuffled.add(new TheMoon(random.nextBoolean()));
        unshuffled.add(new TheSun(random.nextBoolean()));
        unshuffled.add(new Judgement(random.nextBoolean()));
        unshuffled.add(new TheWorld(random.nextBoolean()));
        
        // shuffling deck
        Queue<Card> shuffled = new LinkedList<Card>();
        int i = -1;
        while (unshuffled.size() > 0) {
            i = random.nextInt(unshuffled.size());
            shuffled.add(unshuffled.get(i));
            unshuffled.remove(i);
        } // end of while
        return shuffled;
    } // end of shuffleDeck method
    
    // Given a shuffled deck of tarot cards, the user's name,
    // and a scanner for user input,
    // Reads the user's past, present, and future
    public static void reading(Queue<Card> deck, String name, Scanner scanner) {
        Card current = new Card();
        for (int i = 0; i < 3; i++) { // past, present, and future
            System.out.println();
            // providing buffer between each reading
            switch (i) {
                case 0:
                    System.out.println(name + ", I will begin by reading " +
                        "into your past. Are you ready to begin?");
                    break;
                case 1:
                    System.out.println("Next, I will read into your present. " +
                        "Whenever you are ready,");
                    break;
                default: // 2
                    System.out.println("Finally, let us see what is " +
                    "in store for you in the future. Whenever you are ready,");
            } // end of switch/case
            System.out.println("\n\t\tpress enter to continue");
            scanner.nextLine();
            
            // pulls and reads a card
            current = deck.remove();
            System.out.printf("%s%" + (25 + (current.toString().length()/ 2)) +
                "s%n", "You pulled:", current.toString());
            System.out.printf("%" + (36 + (current.getNumeral().length() / 2)) +
                "s%n", current.getNumeral());
            System.out.printf("%40s%n", ". . . . .");
            System.out.println(current.getDescription());
            System.out.printf("%40s%n", ". . . . .");
        } // end of for loop
    } // end of reading method
} // end of TarotReading class
