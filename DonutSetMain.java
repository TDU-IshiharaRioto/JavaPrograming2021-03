//21AJ013 �Ό��ɑ�

public class DonutSetMain {
	public static void main (String[] args) {
		DonutSet donutSet = new DonutSet();
		donutSet.setDrink(new Drink("�R�[�q�[", 400));
		donutSet.addDonut(new Ring("�`���R���[�g", 300));
		donutSet.addDonut(new Round("�J�X�^�[�h", 350));
		donutSet.print();
		System.out.println ("���v" + donutSet.getTotalPrice() + "�~");
	}
}