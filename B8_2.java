public class B8_2 {
	public static void main (String[] args) {
		ConcreteBox box = new ConcreteBox ();
		for (int i = 0; i < 3; i++) {
			box.add (new ConcreteBall(i));
		}
	}
}