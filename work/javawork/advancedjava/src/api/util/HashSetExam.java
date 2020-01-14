package api.util;

import java.util.HashSet;

public class HashSetExam {

	public static void main(String[] args) {
		//������ ���� ���������� HashSet��ü 2�� �ۼ��ϱ�
		//set1 -> 1���� 10������ ����
		//set2 -> 5���� 15������ ����
		HashSet<Integer> set1 = new HashSet<Integer>();
		HashSet<Integer> set2 = new HashSet<Integer>();
		
		for(int i=1;i<=10;i++) {
			set1.add(i);
		}
		//System.out.println("set1�� ������"+set1.size());
		for(int i=5;i<=15;i++) {
			set2.add(i);
		}
		//System.out.println("set2�� ������"+set2.size());
		//print(set2, "set2");
		//set1�� set2������ ����ϱ�
		HashSet<Integer> set3 = new HashSet<Integer>(set1);
		set3.addAll(set2);
		print(set3, "������");
		
		//set1�� set2������ ����ϱ�
		set1.retainAll(set2);
		print(set1, "������");
	}
	public static void print(HashSet<Integer> set, String name) {
		for (Integer data : set) {
			System.out.println(name+"�� ���:"+data);
		}
		System.out.println("===========================");
	}

}
