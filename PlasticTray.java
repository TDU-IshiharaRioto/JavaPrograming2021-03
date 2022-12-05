//21AJ013 ÎŒ´—É‘å

import java.util.ArrayList;

public class PlasticTray {
	private ArrayList<Strawberry> arrayList = new ArrayList<Strawberry> ();
	public PlasticTray () {
		
	}
	public void put (Strawberry strawberry) {
		this.arrayList.add(strawberry);
	}
	public Strawberry getStrawberry (int index) {
		return this.arrayList.get(index);
	}
	public int getSize () {
		return this.arrayList.size();
	}
	public int getTotalWeight () {
		int size = this.arrayList.size();
		int total = 0;
		for (int i = 0; i < size; i++) {
			Strawberry temp = this.arrayList.get(i);
			total = total + temp.getWeight();
		}
		return total;
	}
	public int getAverageWeight () {
		int size = this.arrayList.size();
		int total = this.getTotalWeight();
		return total / size;
	}
}