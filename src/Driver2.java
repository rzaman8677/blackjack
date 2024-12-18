public class Driver2 {
    public static void main(String[] args) {
        BlackjackPlayer b = new HumanBlackjackPlayer();
        BlackjackDealer a = new BlackjackDealer();
        System.out.println(a.playBlackjack(b, 6));
    }
}