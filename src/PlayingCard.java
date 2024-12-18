import java.util.*;
public class PlayingCard {

    private int suit;
    private int value;
    
    public static final int ACE=1;
    public static final int KING=13;
    public static final int QUEEN=12;
    public static final int JACK=11;
    
    public static final int HEARTS=1;
    public static final int SPADES=2;
    public static final int CLUBS=3;
    public static final int DIAMONDS=4;
    
    private static boolean random = true;
    
    PlayingCard(int suitVal, int valueVal) {
        suit = suitVal;
        value = valueVal;
    }
    
    PlayingCard() {
        if (random) {
            suit = (int)(Math.random()*4+1);
            value = (int)(Math.random()*13+1);
        } else {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Please enter a suit: ");
            suit = scanner.nextInt();
            System.out.println("Please enter a card value: ");
            value = scanner.nextInt();
        }
    }
    
    public int getSuit() {
        return suit;
    }
    
    public int getValue() {
        return value;
    }
    
    public static void setRandom(boolean rand) {
        random = rand;
    }
    
    public String toString() {
        String suitName="";
        if(suit == HEARTS) {
            suitName = "Hearts";
        } else if(suit == SPADES) {
            suitName = "Spades";
        } else if(suit == CLUBS) {
            suitName = "Clubs";
        } else if(suit == DIAMONDS) {
            suitName = "Diamonds";
        }
        String valueName = "";
        if (value == ACE) {
            valueName = "Ace";
        } else if (value == QUEEN) {
            valueName = "Queen";
        } else if (value == JACK) {
            valueName = "Jack";
        } else if (value == KING) {
            valueName = "King";
        } else {
            valueName = String.valueOf(value);
        }  
        return valueName + " of "+ suitName;
    }
    
}