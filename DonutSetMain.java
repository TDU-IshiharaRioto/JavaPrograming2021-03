//21AJ013 石原遼大

public class DonutSetMain {
	public static void main (String[] args) {
		DonutSet donutSet = new DonutSet();
		donutSet.setDrink(new Drink("コーヒー", 400));
		donutSet.addDonut(new Ring("チョコレート", 300));
		donutSet.addDonut(new Round("カスタード", 350));
		donutSet.print();
		System.out.println ("合計" + donutSet.getTotalPrice() + "円");
	}
}