import java.util.ArrayList;

public class Rucksack {
	private ArrayList<Gum> arrayList = new ArrayList<Gum> ();
	public Rucksack () {
		
	}
	public void add (Gum gum) {
		this.arrayList.add (gum);
	}
	public int getSum () {
		int l = this.arrayList.size();
		int sum = 0;
		for (int i = 0; i < l; i++) {
			Gum gum = this.arrayList.get(i);
			sum = sum + gum.getPrice();
		}
		return sum;
	}
	public void printItems () {
		int l = this.arrayList.size();
		int price = 0;
		String name = "";
		for (int i = 0; i < l; i++) {
			Gum gum = this.arrayList.get(i);
			price = gum.getPrice();
			name = gum.getItem();
			System.out.println(name + " " + price + "‰~");
		}
	}
}