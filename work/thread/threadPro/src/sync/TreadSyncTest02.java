package sync;
/* 1. �� ������ �ܾ��� ���ϴ� ������
 *   - SharedObj��ü�� �����ܾ��� ���ؼ� sysout���� ����ϴ� ������
 *   - 5�� ����� �� �ֵ���
 * 2. acc1���¿��� acc2���¿� 100������ ��ü�ϴ� �۾��� �����ϴ� ������
 *   - 20�� ��ü�� �� �ֵ���
 *   	=> AccountŬ���� Ȱ��, sysout���� �������
 *   - SharedObj��ü�� �̿��ؼ� �۾�
 * 3. ����ȭ ���� �ʰ� �׽�Ʈ
 * 4. ����ȭ �ϰ� �׽�Ʈ
*/

public class TreadSyncTest02{
	public static void main(String[] args) {
		//1. ������ü �����
		SharedObj obj = new SharedObj();
		obj.acc1 = new Account("111-222-3333",5000,"����");
		obj.acc2 = new Account("333-555-7777",1000,"�輭��");
		//2. ������ ����
		SumPrintThread t1 = new SumPrintThread(obj);
		Thread t2 = new Thread(new TransferThread(obj));
		//3. ������ ������ start��Ű��
		t1.start();
		t2.start();
	}
}
/*class sumBalance extends Thread{
	SharedObj obj;
	public sumBalance(SharedObj obj) {
		super();
		this.obj = obj;
	}
	public void run() {
		for(int i=0;i<5;i++) {
			System.out.println(obj.acc1.getBalance()+obj.acc2.getBalance());
		}
	}
}
class transfer extends Thread{
	SharedObj obj;
	public transfer(SharedObj obj) {
		super();
		this.obj = obj;
	}
	public void run() {
		for(int i=0;i<20;i++) {
			obj.acc1.withdraw(100);
			obj.acc2.deposit(100);
			System.out.println(obj.acc1.getOwnerName()+obj.acc1.getBalance()+"--"
					+obj.acc2.getOwnerName()+obj.acc2.getBalance());
		}
	}
}*/