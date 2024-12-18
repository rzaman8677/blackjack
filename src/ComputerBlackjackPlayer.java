public class ComputerBlackjackPlayer extends BlackjackPlayer{
	private BlackjackStrategy strategyCopy;
	ComputerBlackjackPlayer(BlackjackStrategy theStrategy){
		strategyCopy = theStrategy;

	}
	public boolean hit(BlackjackHand dealerHand, BlackjackHand 
	playerHand) {
		int handVal = playerHand.HandValue();
		int dealerHandVal = dealerHand.HandValue();
		boolean handSoft = playerHand.isSoft();
		return strategyCopy.hit(handVal, dealerHandVal, handSoft);
	}
}
