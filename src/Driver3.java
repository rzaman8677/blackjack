public class Driver3 {
	public static void main(String[] args) {
		BlackjackStrategy simpleStrat = new ZamanRaiyanStrategy();
//		ZamanRaiyanStrategy zaman = new ZamanRaiyanStrategy();
//		System.out.println(zaman.author());
//		System.out.println(zaman.playerName());
//		System.out.println(simpleStrat.hit(15, 11, true));
//		System.out.println(simpleStrat.hit(15, 11, false));
//		System.out.println(simpleStrat.hit(11, 10, false));
//		System.out.println(simpleStrat.hit(17, 7, false));
//		System.out.println(simpleStrat.hit(16, 6, false));
//		System.out.println(simpleStrat.hit(17, 2, true));
		ComputerBlackjackPlayer a = new ComputerBlackjackPlayer(simpleStrat);
		BlackjackDealer b = new BlackjackDealer();
		System.out.println(b.playBlackjack(a, 1000000));
	}
}