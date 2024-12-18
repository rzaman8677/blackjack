// Raiyan Zaman
public class ZamanRaiyanStrategy extends BlackjackStrategy {
	public boolean hit(int handValue, int dealerHandValue, boolean soft){
		if(handValue > dealerHandValue) {
			return false;
		}
		if(dealerHandValue == handValue && handValue > 16) {
			return false;
		}
		if(handValue < 19) {
			return true;
		} 
		if(dealerHandValue > handValue) {
			return true;
		}
		return false;
	}
	public String author() {
		return "Raiyan Z";
	}
	public String playerName() {
		return "Raiyan Z's Strategy";
	}
}