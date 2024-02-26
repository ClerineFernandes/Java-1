package example1;

public class StaticMethodInsideMain 
{
	static void add()
	{
		System.out.println(3);
	}
	static void substract()
	{
		System.out.println(4);
	}

	public static void main(String[] args) 
	{
		System.out.println(1);
		System.out.println(2);
		add();
		substract();
		

	}

}
