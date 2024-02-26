package Exm_1;

public class conc2
{
	conc2(int a)

	{
		System.out.println("Print 1");
	}
	conc2()
	{
		System.out.println("Print 2");
	}
	public static void main(String[] args)
	{
		new conc2(10);
		new conc2();
	}

}
