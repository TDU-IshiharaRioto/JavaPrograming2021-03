public class B4_1 {
	public static void main (String[] args) {
		Cup cup = new Cup();
		cup.add (new Dice());
		cup.add (new Dice());
		cup.cast ();
		int sum = cup.getSum();
		System.out.println ("�T�C�R���̖ڂ̍��v�F" + sum);
	}
}