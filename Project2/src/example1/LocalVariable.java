package example1;

public class LocalVariable
{
	void add()
	{
		int a=10;
		int b=20;
		int sum=a+b;
		System.out.println(sum);
	}
	void subtract()
	{
		System.out.println("subtract");
	}

	public static void main(String[] args) 
	{
		LocalVariable a1=new LocalVariable();
		a1.add();
		a1.subtract();

	}

}
