package constructor;

public class Subtract {
	Subtract(int a,double b)
	{
		double sum=a+b;
		System.out.println(sum);
	}
	Subtract(int a,int b)
	{
		int sum=a+b;
		System.out.println(sum);
	}
	Subtract(double a,double b)
	{
		double sum=a+b;
		System.out.println(sum);
	}

	public static void main(String[] args) {
		new Subtract(10,9.97);
		new Subtract(10,9);
		new Subtract(1.8,9.8);
		
		
		

	}

}
