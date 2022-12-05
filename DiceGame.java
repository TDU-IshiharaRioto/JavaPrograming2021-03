import jp.tdu.util.KeyboardReader;

public class DiceGame {
	private Cup cup = new Cup();
	private int playerHand;
	public DiceGame (Dice dice0, Dice dice1) {
		this.cup.add (dice0);
		this.cup.add (dice1);
	}
	public void play () {
		this.cup.cast ();
	}
	public void bet () {
		System.out.println ("���i�����j��0�C���i��j��1����͂��Ă��������B:");
		this.playerHand = KeyboardReader.readInt ();
	}
	public void judge () {
		int value0 = this.cup.getValue (0);
		int value1 = this.cup.getValue (1);
		int sum = value0 + value1;
		System.out.println (value0 + "  " + value1 + "�ō��v��" + sum + "�ł��B");
		int result = (sum) % 2;
		if (this.playerHand == result) {
			System.out.println ("�v���C���[�̏���");
		} else {
			System.out.println ("�R���s���[�^�̏���");
		}
	}
}