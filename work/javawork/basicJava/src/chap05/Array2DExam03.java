package chap05;
//��ũ�� page 22. ����3
public class Array2DExam03 {
	public static void main(String[] args) {
		int[][] arr2 = {
				{5,5},
				{10,10,10,10,10},
				{20,20,20},
				{30,30,30,30}
		};
		int count=0;
		int sum=0;
		double avg=0.0;
		for(int r=0;r<arr2.length;r++) {
			for(int c=0;c<arr2[r].length;c++) {
				sum += arr2[r][c];
				System.out.print(arr2[r][c]+" ");
				count++;
			}
			System.out.println();
		}
		
		avg=(double)sum/count;
		System.out.println("sum="+sum);
		System.out.println("avg="+avg);
	}

}
