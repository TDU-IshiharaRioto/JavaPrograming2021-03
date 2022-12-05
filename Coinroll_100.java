//21AJ013

import java.util.ArrayList;

public class Coinroll_100 implements Value{
	private ArrayList<Coin100> arrayList = new ArrayList<Coin100> ();
	public Coinroll_100 () {
		for (int i = 0; i < 50; i++) {
			this.arrayList.add(new Coin100());
		}
	}
	public int getValue () {
		int value = 0;
		int size = this.arrayList.size();
		for (int i = 0; i < size; i++) {
			Coin100 coin = this.arrayList.get(i);
			value = value + coin.getValue();
		}
		return value;
	}
}