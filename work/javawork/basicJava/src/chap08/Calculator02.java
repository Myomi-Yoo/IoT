package chap08;

public class Calculator02 {
	private double result;
	public Calculator02() {
		
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
		try {
			result = num1/num2;
		}catch(Exception e) {
			System.out.println("Exception�� �߻� �Ͽ����ϴ�. �ٽ� �Է��� �ּ���");
		}
		return result;		
	}
	public void print() {
		System.out.println("���: "+result);
	}
}
