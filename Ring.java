//21AJ013 �Ό��ɑ�

public class Ring implements Donut{
	private String addition;
	private int price;
	public Ring (String addition, int price) {
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
		return this.addition + "�����O�h�[�i�c";
	}
	public void print () {
		System.out.println (this.getName() + this.price + "�~");
	}
}