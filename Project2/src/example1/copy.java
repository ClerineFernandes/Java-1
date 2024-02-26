package example1;

public class copy
{
	copy(int a, int b)
	{
		int sum=a+b;
		System.out.println(sum);
		
	}
	copy(int a, double b)
	{
		double sum=a+b;
		System.out.println(sum);
	}
	copy(double a, double b)
	{
		double sum=a+b;
		System.out.println(sum);
	}
	public static void main(String[] args)
	{
		new copy(10,29);
		new copy(10,2.8);
		new copy(1.0,2.8);
	}
}

	
		