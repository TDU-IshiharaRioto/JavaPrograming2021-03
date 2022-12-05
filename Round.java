//21AJ013 石原遼大

public class Round implements Donut{
	private String addition;
	private int price;
	public Round (String addition, int price) {
		this.addition = addition;
		this.price = price;
	}
	public String getAddition () {
		return this.addition;
	}
	public int getPrice () {
		return this.price;
	}
	public String getName () {
		return this.addition + "ラウンドドーナツ";
	}
	public void print () {
		System.out.println (this.getName() + this.price + "円");
	}
}