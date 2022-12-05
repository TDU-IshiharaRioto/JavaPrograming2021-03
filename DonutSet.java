//21AJ013 РќМіЧ…Се

import java.util.ArrayList;

public class DonutSet {
	private Drink drink;
	private ArrayList<Donut> list = new ArrayList<Donut>();
	public DonutSet () {
	}
	public void setDrink (Drink drink) {
		this.drink = drink;
	}
	public void addDonut (Donut donut) {
		this.list.add(donut);
	}
	public int getTotalPrice () {
		int size = this.list.size();
		int sum = this.drink.getPrice();
		for (int i = 0; i < size; i++) {
			Donut donut = list.get(i);
			sum = sum + donut.getPrice();
		}
		return sum;
	}
	public void print () {
		this.drink.print();
		int size = this.list.size();
		for (int i = 0; i < size; i++) {
			Donut donut = this.list.get(i);
			donut.print();
		}
	}
}