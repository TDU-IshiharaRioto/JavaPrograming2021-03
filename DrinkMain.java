//21AJ013 石原遼大

public class DrinkMain {
	public static void main (String[] args) {
		Drink drink1 = new Drink ("コーヒー", 400);
		Drink drink2 = new Drink ("ミルクティー", 350);
		System.out.println (drink1.getName());
		System.out.println (drink1.getPrice());
		drink1.print();
		drink2.print();
	}
}