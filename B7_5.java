import java.util.ArrayList;

public class B7_5 {
	public static void main (String[] args) {
		ArrayList<Educatee> arrayList = new ArrayList<Educatee> ();
		Educatee educatee1 = new Educatee("00ID000", "naamura");
		arrayList.add(educatee1);
		educatee1.setHeight(170);
		Educatee educatee2 = arrayList.get(0);
		boolean b = (educatee1 == educatee2);
		System.out.println (b);
		System.out.println (educatee1.getHeight());
		System.out.println (educatee2.getHeight());
	}
}