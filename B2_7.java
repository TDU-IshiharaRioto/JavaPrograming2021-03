public class B2_7 {
	public static void main (String[] args) {
		Teacher teacher1 = new Teacher ("t02", "è¨ír");
		Teacher teacher2 = new Teacher ("t03", "çÇìc");
		teacher1.setSalary (200000);
		String text1 = teacher1.getId () + " " + teacher1.getName () + " " + teacher1.getSalary ();
		String text2 = teacher2.getId () + " " + teacher2.getName () + " " + teacher2.getSalary ();
		System.out.println (text1);
		System.out.println (text2);
	}
}