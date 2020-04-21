package basic;
/*
 * ���������α׷����� �����ϼ���
 *  - 1���� 100���� ��� DigitThread
 *  - A~Z���� ����ϴ� AlphaThread
 *  - ThreadExam01�� main�޼ҵ忡�� DigitThread�� AlphaThread�� ���ÿ� �����غ���.
 */
class DigitThread2 implements Runnable{
	public void run() {
		for (int i = 1; i <= 100; i++) {
			System.out.print(i);
			try {
				Thread.sleep(100);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}
class AlphaThread2 implements Runnable{
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
public class RunnableExam01 {
	public static void main(String[] args) {
		System.out.println("*****���α׷� ����*****");
		DigitThread2 dr1 = new DigitThread2();
		AlphaThread2 da1 = new AlphaThread2();
		Thread d1 = new Thread(dr1);
		Thread a1 = new Thread(da1);
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
