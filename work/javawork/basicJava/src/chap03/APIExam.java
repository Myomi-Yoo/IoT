package chap03;

import java.util.Random;

public class APIExam {
	public static void main(String[] args) {
		Random ran = new Random();
		int result = ran.nextInt();
		System.out.println("������=>"+result);

		//1���� 100������ ������ ���
		result = ran.nextInt(100)+1;
		System.out.println(result);
		
	}

}
