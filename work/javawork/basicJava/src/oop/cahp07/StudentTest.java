package oop.cahp07;

public class StudentTest {

	public static void main(String[] args) {
		Student s1 = new Student("Kim",25,100,90,95,89);
		Student s2 = new Student("Lee",20,60,70,99,98);
		Student s3 = new Student("Park",19,68,86,60,40);
		
		Teacher t1 = new Teacher("�嵿��",45,"Spring");
		Staff e = new Staff("�輭��",25,"�����");
		
		s1.print();
		s2.print();
		s3.print();
		t1.print();
		e.print();
		
		/*System.out.println(s1.getName()+"���:"+s1.getAvg()+"����:"+s1.getGrade());
		System.out.println(s2.getName()+"���:"+s2.getAvg()+"����:"+s2.getGrade());
		System.out.println(s3.getName()+"���:"+s3.getAvg()+"����:"+s3.getGrade());*/
		
	}

}
