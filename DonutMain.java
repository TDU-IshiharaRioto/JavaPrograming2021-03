//21AJ013 石原遼大

public class DonutMain {
	public static void main (String[] args) {
		Donut donut1 = new Ring ("チョコレート", 300);
		Donut donut2 = new Round ("カスタード", 350);
		System.out.println (donut1.getAddition());
		System.out.println (donut1.getPrice());
		System.out.println (donut1.getName());
		donut1.print();
		donut2.print();
	}
}