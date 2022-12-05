import java.util.ArrayList;

public class B3_5 {
	public static void main (String[] args) {
		ArrayList<Dice> diceBox = new ArrayList<Dice> ();
		//System.out.println (diceBox.size ());
		diceBox.add (new Dice());
		diceBox.add (new Dice());
		diceBox.add (new Dice());
		diceBox.add (new Dice());
		diceBox.add (new Dice());
		//System.out.println (diceBox.size ());
		Dice dice1 = diceBox.get (0);
		Dice dice2 = diceBox.get (1);
		Dice dice3 = diceBox.get (2);
		Dice dice4 = diceBox.get (3);
		Dice dice5 = diceBox.get (4);
		
		dice1.cast ();
		dice2.cast ();
		dice3.cast ();
		dice4.cast ();
		dice5.cast ();
		
		System.out.println (dice1.getValue ());
		System.out.println (dice2.getValue ());
		System.out.println (dice3.getValue ());
		System.out.println (dice4.getValue ());
		System.out.println (dice5.getValue ());
	}
}