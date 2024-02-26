package example1;

public class GlobalVariable1 
{
	static int a;
	static int b;
	static void subtract()
	{
		int a=300;
		int b=200;
		int sum=a-b;
		System.out.println(sum);
	}
	static void add()
	{
		int a=900;
		int b=677;
		System.out.println(a+b);
	}

	public static void main(String[] args)
	{
		subtract();
		add();
		System.out.println(a);
		

	}

}
