public class B8_3 {
	public static void main (String[] args) {
		Box box = new ConcreteBox();
		/*
		box.add(new ConcreteBall(1));
		box.add(new ConcreteBall(2));
		box.add(new ConcreteBall(3));
		*/
		for (int i = 0; i < 75; i++) {
			box.add(new ConcreteBall(i + 1));
		}
		int size = box.size();
		for (int i = 0; i < size; i++) {
			Ball ball = box.take();
			System.out.println(i + "ƒ{[ƒ‹‚Ì”Ô†F" + ball.getNumber());
		}
	}
}