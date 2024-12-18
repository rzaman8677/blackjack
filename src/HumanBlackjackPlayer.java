import java.util.Scanner;
public class HumanBlackjackPlayer extends BlackjackPlayer {
    public boolean hit(BlackjackHand dealerHand, BlackjackHand playerHand) {
        System.out.print("\nDealer's hand: \n");
        dealerHand.print();
        System.out.println("\nYour hand: ");
        playerHand.print();
        System.out.println("");
        Scanner scanner = new Scanner(System.in);
        System.out.println("Do you want to hit? (yes/no)");
        String answer = scanner.next().toLowerCase();
        while(!answer.equals("yes") && !answer.equals("no")) {
            System.out.println("Do you want to hit? (yes/no)");
            answer = scanner.next().toLowerCase();
        }
        if (answer.equals("yes")) {
            return true;
        } else if(answer.equals("no")) {
            return false;
        }
        return false;
    }
    public void dealerHit(BlackjackHand dealerHand) {
        System.out.println("Dealer hits.");
        System.out.println("Dealer's hand: ");
        dealerHand.print();
        System.out.println("");
    }
    public void playerBusts(BlackjackHand playerHand) {
        System.out.println("You busted.");
        System.out.println("Your hand: ");
        playerHand.print();
        System.out.println("--------------------");
    }
    public void playerTies(BlackjackHand playerHand, BlackjackHand dealerHand) {
        System.out.println("You tie the dealer.");
        System.out.println("Your hand: ");
        playerHand.print();
        System.out.println("\nDealer's hand: ");
        dealerHand.print();
        System.out.println("--------------------");
    }
    public void playerWins(BlackjackHand playerHand, BlackjackHand dealerHand) {
        System.out.println("You win.");
        System.out.println("Your hand: ");
        playerHand.print();
        System.out.println("\nDealer's hand: ");
        dealerHand.print();
        System.out.println("--------------------");
    }
    public void dealerBusts(BlackjackHand dealerHand) {
        System.out.println("Dealer busted.");
        System.out.println("Dealer's hand: ");
        dealerHand.print();
        System.out.println("--------------------");
    }
    public void dealerWins(BlackjackHand dealerHand, BlackjackHand playerHand) {
        System.out.println("Dealer wins.");
        System.out.println("Dealer's hand: ");
        dealerHand.print();
        System.out.println("\nYour hand: ");
        playerHand.print();
        System.out.println("--------------------");
    }
    public void playerStands(BlackjackHand playerHand) {
        System.out.println("You stand.");
        System.out.println("Your hand: ");
        playerHand.print();
        System.out.println("");
    }
}