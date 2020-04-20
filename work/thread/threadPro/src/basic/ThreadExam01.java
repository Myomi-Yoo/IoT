package basic;
/*
 * ���������α׷����� �����ϼ���
 *  - 1���� 100���� ��� DigitThread
 *  - A~Z���� ����ϴ� AlphaThread
 *  - ThreadExam01�� main�޼ҵ忡�� DigitThread�� AlphaThread�� ���ÿ� �����غ���.
 */
class DigitThread extends Thread{
	public void run() {
		for (int i = 1; i <= 100; i++) {
			System.out.print(i);
			try {
				Thread.sleep(100);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			if(i%5==0) {
				System.out.println();
			}
		}
	}
}
class AlphaThread extends Thread{
	public void run() {
		for (char i = 'A'; i <= 'Z'; i++) {
			System.out.print(i);
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}
public class ThreadExam01 {
	public static void main(String[] args) {
		System.out.println("*****���α׷� ����*****");
		DigitThread d1 = new DigitThread();
		AlphaThread a1 = new AlphaThread();
		d1.start();
		a1.start();
		System.out.println("�۾���........");
		for (int i = 1; i <= 10; i++) {
			System.out.print("main");
			try {
				Thread.sleep(200);//�����帧�� �����.
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		System.out.println("*****���α׷� ����*****");
	}
}
