public class B9_3 {
	public static void main (String[] args) {
		SubEducator educator1 = new SubEducator ("ID0123", "naka");
		SubEducator educator2 = new SubEducator ("IE0002", "ooyama");
		educator1.setPassword ("2222");
		educator2.setPassword ("3333");
		System.out.println (educator1.getPassword());
		System.out.println (educator2.getPassword());
	}
}