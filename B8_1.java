import java.util.ArrayList;

public class B8_1 {
	public static void main (String[] args) {
		ArrayList<Ball> arrayList = new ArrayList<Ball> ();
		for (int i = 0; i < 75; i++) {
			arrayList.add (new ConcreteBall(i + 1));
			Ball ball = arrayList.get(i);
			System.out.println (ball.getNumber());
		}
	}
}