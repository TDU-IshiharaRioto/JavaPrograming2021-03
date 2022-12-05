import java.util.ArrayList;

public class B8_10 {
	public static void main (String[] args) {
		ArrayList<Ball> list = new ArrayList<Ball> ();
		for (int i = 0; i < 75; i++) {
			list.add (new ConcreteBall (i + 1)) ;
		}
		int size = list.size();
		for (int i = 0; i < size; i++) {
			Ball ball = list.get(i);
			System.out.println (ball.getNumber());
		}
	}
}