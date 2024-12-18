public class BlackjackHand extends Hand {
    private int handValue;
    private boolean soft;
    BlackjackHand(boolean dealer){
        super(1);
        if(!dealer) {
            super.addCard();
        }
    }
    BlackjackHand(){
        super(0);
    }
    private void computeValue(){
        handValue = 0;
        boolean aces = false;
        soft = false;
        for(int i = 0; i < super.numberOfCards(); i++) {
            PlayingCard currentCard = super.nthCard(i+1);
            if(currentCard.getValue()  == PlayingCard.KING || currentCard.getValue() == PlayingCard.QUEEN || currentCard.getValue() == PlayingCard.JACK) {
                handValue += 10;
            } else {
                handValue += currentCard.getValue();
            }
            if(currentCard.getValue() == PlayingCard.ACE) {
                aces = true;
            } 
        }
        if(aces && handValue < 12) {
            handValue += 10;
            soft = true;
        }
    }
    public void addCard(PlayingCard card) {
    	super.addCard(card);
    	computeValue();
    }
    public void addCard() {
    	super.addCard();
    	computeValue();
    }
    public int HandValue(){
    	computeValue();
        return handValue;
    }
    public boolean isSoft(){
        return soft;
    }
}