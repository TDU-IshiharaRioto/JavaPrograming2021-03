//21AJ013 �Ό��ɑ�

public class DonutMain {
	public static void main (String[] args) {
		Donut donut1 = new Ring ("�`���R���[�g", 300);
		Donut donut2 = new Round ("�J�X�^�[�h", 350);
		System.out.println (donut1.getAddition());
		System.out.println (donut1.getPrice());
		System.out.println (donut1.getName());
		donut1.print();
		donut2.print();
	}
}