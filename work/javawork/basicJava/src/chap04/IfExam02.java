package chap04;
//if����  ��ø�ؼ� ����ϴ� ���� - gender�� age�� �Ǵ��ؼ� ����� ����ϴ� ����
import java.util.Scanner;
//Ctrl+Shift+f => �ڵ带 �������ش�.
public class IfExam02 {
	public static void main(String[] args) {
		Scanner key = new Scanner(System.in);
		System.out.print("������ �Է��ϼ��� :");
		int sex = key.nextInt();
/*		if(sex<1 | sex>4) {
			System.out.print("���ڸ� �߸� �Է�");
		} else {
			System.out.Print("���̸� �Է��ϼ��� : ");
			int age = key.nextInt();
			// ���̿� ���� �� �ۼ�
		}*/
		System.out.print("���̸� �Է��ϼ��� :");
		int age = key.nextInt();
		if(sex>0 & sex<=4) {
			if(sex==1 | sex==3) {
				if(age<=19) {
					System.out.println("û�ҳⳲ��");
				}else {
					System.out.println("���γ���");
				}
			}else {
				if(age<=19) {
					System.out.println("û�ҳ⿩��");
				}else {
					System.out.println("���ο���");
				}
			
			}
		}
	}

}
