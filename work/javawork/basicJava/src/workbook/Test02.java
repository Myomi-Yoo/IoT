package workbook;

public class Test02 {
	public static void main(String[] args) {
		int salary = Integer.parseInt(args[0]);
		Company com = new Company();
		com.setSalary(salary);
		System.out.println("연 기본급 합: "+com.getIncome()+" 세후:"+com.getAfterTaxIncome());
		System.out.println("연 보너스 합: "+com.getBonus()+" 세후: "+com.getAfterTaxBonus());
		System.out.println("연 지급액 합: "+(com.getAfterTaxIncome()+com.getAfterTaxBonus()));
	}

}
