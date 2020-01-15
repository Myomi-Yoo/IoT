package api.io;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;

public class ScoreTest {
	public static void main(String[] args) {
		//BufferedReader�� ���
		//�׻� �� �÷����� ����
		/*
		 *	[�������]
		 *	�̹�ȣ�� ������ 100��
		 *	������ ������ 98��
		 *	������� ������ 99��
		 *	����:____
		 *	���:____ 
		 */	
		BufferedReader br = null;
		int sum = 0;
		double avg = 0;
		int count = 0;
		String[] str = null;
		try {
			br = new BufferedReader(new FileReader("src/data/score.txt"));
			while(true) {
				String data = br.readLine();
				if(data==null) {
					break;
				}
				count++;
				str = data.split(",");
				System.out.println(str[0]+"�� ������"+str[1]);
				sum += Integer.parseInt(str[1]);
			}
			avg = sum/count;
			System.out.println("����:"+sum);
			System.out.println("���:"+avg);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				if(br!=null)br.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
	}

}
