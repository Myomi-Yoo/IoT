package workbook;
//��ũ�� page55. ���� 2
public class CompanyTest {
	public static void main(String[] args) {
		//Company�� salary�� double�̰� �Է¹��� salary�� int�̹Ƿ� �ڵ�casting�� �ȴ�.
		int salary = Integer.parseInt(args[0]);
		Company com = new Company(salary);
		
		System.out.println("�� �⺻�� ��: "+com.getIncome()+" ����:"+com.getAfterTaxIncome());
		System.out.println("�� ���ʽ� ��: "+com.getBonus()+" ����: "+com.getAfterTaxBonus());
		System.out.println("�� ���޾� ��: "+(com.getAfterTaxIncome()+com.getAfterTaxBonus()));
	}

}
