package chap04;
//cnotinue - ����� ��ġ �Ʒ��� �ڵ带 skip�ϱ� ���� ���
public class GuGu_Continue {
	public static void main(String[] args) {
		for(int row=2;row<=9;row++) {
			if(row==5) {
				continue;
			}
			for(int i=1;i<=9;i++) {
				/*if(row==5) { break���� ���� for�� ����Ǿ� �����Ƿ� �ݺ����� ��������� �ʴ´�.
					break;
				}*/
				System.out.print(row+"*"+i+"="+i*row+"\t");
			}
			System.out.println();
		}
	}

}
