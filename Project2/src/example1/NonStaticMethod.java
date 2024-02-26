package example1;

public class NonStaticMethod 
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
		int a=10;
		int b=20;
		int result=a-b;
		System.out.println(result);
	}
	static void multiply()
	{
		int a=90;
		int b=89;
		int total=a*b;
		System.out.println(total);
	}
	static void divide()
	{
		int a=67;
		int b=78;
		int ans=a%b;
		System.out.println(ans);
	}

	public static void main(String[] args) 
	{
		NonStaticMethod a1=new NonStaticMethod();
		a1.add();
		a1.subtract();
		multiply();
		divide();
		
	}

}
