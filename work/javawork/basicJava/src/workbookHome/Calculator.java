package workbookHome;

public class Calculator {
	private double result;
	public Calculator() {
		
	}
	public double plus(int num1, int num2) {
		result = num1+num2;
		return result;
	}
	public double minus(int num1, int num2) {
		result = num1-num2;
		return result;
	}
	public double multiplication(int num1, int num2) {
		result = num1*num2;
		return result;
	}
	public double divide(int num1, int num2) {
		if(num2==0) {
			System.out.println("Exception�� �߻��Ͽ����ϴ�. �ٽ� �Է��� �ּ���");
			result =0;
		} else {
			result = num1/num2;
		}
		return result;		
	}
	public void print() {
		System.out.println("���: "+result);
	}
}
