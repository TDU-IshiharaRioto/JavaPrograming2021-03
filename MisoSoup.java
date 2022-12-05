//21AJ013 РќМіЧ…Се

public class MisoSoup implements SideDish{
	private String food;
	private int price;
	public MisoSoup (String food, int price) {
		this.food = food;
		this.price = price;
	}
	public String getFood () {
		return this.food;
	}
	public int getPrice () {
		return this.price;
	}
	public String getName () {
		return this.food + "ВЁВїП`";
	}
	public void print () {
		System.out.println (this.food + "ВЁВїП`" + this.price + "Й~");
	}
}