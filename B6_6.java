public class B6_6 {
	public static void main (String[] args) {
		CoinBox coinBox = new CoinBox();
		coinBox.add (new Coin100());
		coinBox.add (new Coin100());
		coinBox.add (new Coin50());
		coinBox.add (new Check(250));
		coinBox.print ();
		Value coin100 = coinBox.remove(100);
		System.out.println (coin100.getValue());
	}
}