public class B7_4 {
	public static void main (String[] args) {
		Educatee educatee1 = new Educatee ("21AJ013", "石原遼大");
		Educatee educatee2 = new Educatee ("21AJ043", "のぞみん");
		educatee1.setHeight (175);
		educatee2.setHeight (300);
		System.out.println (educatee1.getHeight());
		System.out.println (educatee2.getHeight());
	}
}