package test;
public class TimeExam{
	public static void main(String[] args){
		//time������ ����� ���� �� �������̴�.
		//__�ð� __�� __���� ���·� ����ϱ�.
		int time = 8888;
		int hour = time / 3600;

		time = time - (hour * 3600);

		int min = time / 60;
		int sec = time % 60;

		System.out.println(hour+ "�ð�" + min + "��" + sec + "��");

	}
}
