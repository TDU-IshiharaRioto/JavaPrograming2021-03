import java.util.ArrayList;

public class EducateeList {
	private ArrayList<Educatee> arrayList = new ArrayList<Educatee> () ;
	public EducateeList () {
		
	}
	public void add (Educatee educatee) {
		this.arrayList.add (educatee);
	}
	public Educatee get (int number) {
		return this.arrayList.get(number);
	}
	public int getAverageHeight () {
		int sum = 0;
		int size = arrayList.size();
		for (int i = 0; i < size; i++) {
			Educatee temp = this.arrayList.get(i);
			sum = sum + temp.getHeight();
		}
		int average = sum / size;
		return average;
	}
	public int size () {
		return this.arrayList.size();
	}
}