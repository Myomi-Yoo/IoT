package chap04;

import java.util.Scanner;

//���ڸ� �Է¹޾Ƽ� �������� ������� ����ϱ�
//��, ����� ��쿡�� ¦������ Ȧ������ ����ϱ�, 0�� ����
public class IfExam01 {
	public static void main(String[] args) {
		Scanner key = new Scanner(System.in);
		System.out.print("���ڸ� �Է��ϼ��� : ");
		int num = key.nextInt();
		if(num<0) {
			System.out.println(num+"�� �����Դϴ�.");
		}else {
			if(num%2==0) {
				System.out.println(num+"�� ¦���Դϴ�.");
			}else {
				System.out.println(num+"�� Ȧ���Դϴ�.");
			}
		}
	}

}
