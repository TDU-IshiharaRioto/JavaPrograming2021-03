public class CoinrollMain {
	public static void main (String[] args) {
		CoinBox coinBox = new CoinBox();
		coinBox.add (new Coin100());
		coinBox.add (new Coin100());
		coinBox.add (new Coin50());
		coinBox.add (new Coinroll_100());
		
		coinBox.print();
		int sum = coinBox.getSum();
		System.out.println("――――");
		System.out.println("合計　" + sum + "円");
	}
}