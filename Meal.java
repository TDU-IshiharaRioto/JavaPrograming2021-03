//21AJ013 РќМіЧ…Се

import java.util.ArrayList;

public class Meal {
	private ArrayList<SideDish> meal = new ArrayList<SideDish>();
	public Meal () {
	}
	public void addSideDish (SideDish sideDish) {
		this.meal.add(sideDish);
	}
	public int getTotalPrice () {
		int price = 0;
		int size = meal.size();
		for (int i = 0; i < size; i++) {
			SideDish temp = meal.get(i);
			price = price + temp.getPrice();
		}
		return price;
	}
	public void print () {
		int size = meal.size();
		for (int i = 0; i < size; i++) {
			SideDish temp = meal.get(i);
			temp.print();
		}
	}
}