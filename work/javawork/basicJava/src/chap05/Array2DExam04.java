package chap05;

import java.util.Random;

//��ũ�� page 23. ����4
public class Array2DExam04 {
	public static void main(String[] args) {
		Random rand = new Random();
		
		int[] arr3 = new int[5];
		int sum=0;
		double avg=0.0;
		
		for(int i=0;i<arr3.length;i++) {
			arr3[i] = rand.nextInt(10)+1;
			System.out.print(arr3[i]+" ");
		}
		System.out.println();
		
		for(int i=0;i<arr3.length;i++) {
			sum += arr3[i];
		}
		avg=(double)sum/arr3.length;
		
		System.out.println("sum="+sum);
		System.out.println("avg="+avg);
	}

}
