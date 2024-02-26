package Exm_1;

public class Method1
{
	void add()
	{
		int a=10;
		int b=20;
		int sum=a+b;
		System.out.println(sum);
	}
	void add(String a)
	{
		System.out.println("Hello");
	}
	

	public static void main(String[] args) 
	{
		Method1 a1=new Method1();
		a1.add();
		a1.add("clerine");

	}

}
