package workbook;

public class Test06_Array {

	public static void main(String[] args) {
		Student[] student = new Student[3];
		
		for(int i=0;i<student.length;i++) {
			student[i] = new Student();
		}
		
		student[0].setName("Kim");
		student[0].setKorean(100);
		student[0].setEnglish(90);
		student[0].setMath(95);
		student[0].setScience(89);
		
		
		student[1].setName("Lee");
		student[1].setKorean(60);
		student[1].setEnglish(70);
		student[1].setMath(99);
		student[1].setScience(98);
		
		student[2].setName("Park");
		student[2].setKorean(68);
		student[2].setEnglish(86);
		student[2].setMath(60);
		student[2].setScience(40);
		
		for(int i=0;i<student.length;i++) {
			//System.out.println(student[i].getName()+" ���: "+student[i].getAvg()+" ����: "+student[i].getGrade());
			student[i].print();
		}
		
	}

}