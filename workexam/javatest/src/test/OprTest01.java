package test;
public class OprTest01{
	public static void main(String[] args) 
	{
		int x, y;

		x = 5;
		y = x++;
		System.out.println(x);
		System.out.println(y);

		x = 5;
		y = ++x;
		System.out.println(x);
		System.out.println(y);

		x = 5;
		y = x--;
		System.out.println(x);
		System.out.println(y);

		x = 5;
		y = --x;
		System.out.println(x);
		System.out.println(y);
	}
}
