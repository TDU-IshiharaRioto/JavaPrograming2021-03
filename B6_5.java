public class B6_5 {
	public static void main (String[] args) {
		CoinBox coinBox = new CoinBox ();
		coinBox.add (new Coin100());
		coinBox.add (new Coin100());
		coinBox.add (new Coin50());
		coinBox.add (new Check(250));
		System.out.print ("���v" + coinBox.getSum());
		System.out.println("�ł��B");
	}
}