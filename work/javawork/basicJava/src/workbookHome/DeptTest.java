package workbookHome;

import java.util.Scanner;

public class DeptTest {

	public static void main(String[] args) {
		Scanner key = new Scanner(System.in);
		System.out.println("���� �Է��ϼ���: ");
		String name = key.next();
		double evaluationA = key.nextDouble();
		double evaluationB = key.nextDouble();
		double evaluationC = key.nextDouble();
		double evaluationD = key.nextDouble();
		double evaluationE = key.nextDouble();
		Department dept = new Department(name, evaluationA, evaluationB, evaluationC, evaluationD, evaluationE);
		dept.evaluationNumber();
		dept.print();
	}	

}
