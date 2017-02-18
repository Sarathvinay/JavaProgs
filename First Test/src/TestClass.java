import java.util.Scanner;

public class TestClass {

	int x;
	
	public void getter_setter(int a)
	{
		if (a>10)
			throw new ArithmeticException("Number must be less than 10");
		else
			x=a;
	}
	
	public int retrieve()
	{
		return this.x;
	}
	
	
	public static void main(String[] args)
	{
		int num;
		Scanner stdin = new Scanner(System.in);
		System.out.println("Enter a number (<10)");
		num = stdin.nextInt();
		TestClass t1 = new TestClass();
		t1.getter_setter(num);
		stdin.close();
	}
}

