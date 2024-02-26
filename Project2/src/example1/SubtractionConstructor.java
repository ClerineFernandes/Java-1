package example1;

public class SubtractionConstructor
{
	SubtractionConstructor(int a, int b)
	{
		int sum=a+b;
		System.out.println(sum);
	}
	SubtractionConstructor(int a, double b)
	{
		double sum=a+b;
		System.out.println(sum);
	}
	SubtractionConstructor(double a, double b)
	{
		double sum=a+b;
		System.out.println(sum);
	}
	

	public static void main(String[] args)
	{
		new SubtractionConstructor(20, 40);
		new SubtractionConstructor(20, 0.8);
		new SubtractionConstructor(8.9, 8.9);

	}


		
	}
	
	

	