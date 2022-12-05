//21AJ013 石原遼大

public class FriedFood implements SideDish{
	private String food;
	private int price;
	public FriedFood (String food, int price) {
		this.food = food;
		this.price = price;
	}
	public String getFood () {
		return food;
	}
	public int getPrice () {
		return price;
	}
	public String getName () {
		return this.food + "フライ";
	}
	public void print () {
		System.out.println (this.food + "フライ" + this.price + "円");
	}
}