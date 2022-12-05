import java.util.ArrayList;
import java.util.Random;

public class Gashapon {
	private Random random = new Random();
	private ArrayList<Capsule> arrayList = new ArrayList<Capsule> ();
	public Gashapon () {
		this.arrayList.add (new Capsule (new Eraser("キン肉マン")));
		this.arrayList.add (new Capsule (new Eraser("ドラゴンボール")));
		this.arrayList.add (new Capsule (new KeyHolder("ハローキティ")));
	}
	public Capsule gasha () {
		/*
		int size = this.arrayList.size();
		int number = this.random.nextInt(size);
		*/
		int index = this.random.nextInt(this.arrayList.size());
		return this.arrayList.remove(index);
	}
}