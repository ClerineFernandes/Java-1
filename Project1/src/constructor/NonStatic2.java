package constructor;

public class NonStatic2 {
	void multiply()
	{
		int a=600;
		int b=900;
		int sum=a*b;
		System.out.println(sum);
	}
	void divide()
	{
		int a=60;
		int b=300;
		int sum=a%b;
		System.out.println(sum);
	}
	static void add()
	{
		int a=100;
		int b=300;
		int sum=a+b;
		System.out.println(sum);
	}
	static void subtract()
	{
		int a=100;
		int b=300;
		int sum=a-b;
		System.out.println(sum);
	}

	public static void main(String[] args) {
		System.out.println("Execute");
		NonStatic2 a1=new NonStatic2();
		a1.divide();
		a1.multiply();
		add();
		subtract();
		
		

	}

}
