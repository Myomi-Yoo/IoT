package chap04;

import java.util.Scanner;

public class ForExam02 {
	public static void main(String[] args) {
		Scanner key = new Scanner(System.in);
		System.out.print("����� �� : ");
		int gugu = key.nextInt();
		
		for(int i=1;i<=9;i++) {
			int result = gugu * i;
			System.out.println(gugu + "*" + i + "=" +result);
		}
			
	}

}
