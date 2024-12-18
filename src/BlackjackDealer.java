public class BlackjackDealer {
    public double playBlackjack(BlackjackPlayer player, int numGames){
        double playerWins = 0;
        for(int i = 0; i < numGames; i++) {
            BlackjackHand dealerHand = new BlackjackHand(true);
            BlackjackHand playerHand = new BlackjackHand(false);
            boolean isBust = false;
            while(!isBust) {
                if(player.hit(dealerHand, playerHand)){
                    playerHand.addCard();
                    if(playerHand.HandValue() > 21) {
                        player.playerBusts(playerHand);
                        isBust = true;
                    }
                }
                else{
                    isBust = true;
                }
            }
            if(!(playerHand.HandValue() > 21)) {
                while(dealerHand.HandValue() < 17) {
                    dealerHand.addCard();
                    player.dealerHit(dealerHand);
                    if(dealerHand.HandValue() > 21) {
                        player.dealerBusts(dealerHand);
                        playerWins+=1;
                    }
                }
                if(!(dealerHand.HandValue() > 21)) {
                    if(dealerHand.HandValue() > playerHand.HandValue()) {
                        player.dealerWins(dealerHand, playerHand);
                    } else if(dealerHand.HandValue() < playerHand.HandValue()) {
                        player.playerWins(playerHand, dealerHand);
                        playerWins+=1;
                    } else {
                        player.playerTies(playerHand, dealerHand);
                        playerWins+=0.5;
                    }
                }
            }
        }
        return(playerWins / numGames);
    }
}