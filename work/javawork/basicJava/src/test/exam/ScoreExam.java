package test.exam;
public class ScoreExam{
	public static void main(String[] args){
		int kor = 95;
		int math = 100;
		int eng = 90;
		int total = kor + math + eng;
		double avg = total/3;

		System.out.println("����=>"+total);
		System.out.println("���=>"+avg);
	}
}