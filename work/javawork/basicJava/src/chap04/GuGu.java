package chap04;

public class GuGu {
	public static void main(String[] args) {
		int gugu=0;
		for(int row=1;row<=9;row++) {
			for(int i=2;i<=9;i++) {
				gugu = i * row;
				System.out.print(i+"*"+row+"="+gugu+"\t");
			}
			System.out.println();
		}
	}

}
