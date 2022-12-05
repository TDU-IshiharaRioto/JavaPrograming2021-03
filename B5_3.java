public class B5_3 {
	public static void main (String[] args) {
		Cup cup = new Cup ();
		Dice dice0 = new Dice ();
		Dice dice1 = new Dice ();
		cup.add (dice0);
		cup.add (dice1);
		cup.cast ();
		int sum = cup.getSum ();
		System.out.println (sum);
		Dice dice3 = cup.get(0);
		Dice dice4 = cup.get(1);
		System.out.println (dice3.getValue () + "  " + dice4.getValue ());
	}
}