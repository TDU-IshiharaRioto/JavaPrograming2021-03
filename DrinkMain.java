//21AJ013 �Ό��ɑ�

public class DrinkMain {
	public static void main (String[] args) {
		Drink drink1 = new Drink ("�R�[�q�[", 400);
		Drink drink2 = new Drink ("�~���N�e�B�[", 350);
		System.out.println (drink1.getName());
		System.out.println (drink1.getPrice());
		drink1.print();
		drink2.print();
	}
}