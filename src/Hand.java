import java.util.ArrayList;
public class Hand {
	private ArrayList<PlayingCard> cards;
	Hand(int initialCards){
        cards = new ArrayList<PlayingCard>();
        for(int i = 0; i < initialCards; i++) {
            cards.add(new PlayingCard());
        }
	}
	public void addCard(PlayingCard card) {
        cards.add(card);
    }
    public void addCard(){
        cards.add(new PlayingCard());
    }
    public int numberOfCards() {
        return(cards.size());
    }
    public PlayingCard nthCard(int n) {
        return(cards.get(n-1));
    }
    public void print(){
        for(PlayingCard a: cards) {
            System.out.println(a);
        }
    }
}