import jp.tdu.util.KeyboardReader;

public class MyApplication implements Application {
	public MyApplication () {
	}
	public void execute () {
		DiceGame diceGame = new DiceGame (new Dice(), new Dice ());
		diceGame.play ();
		diceGame.bet ();
		diceGame.judge ();
	}
}