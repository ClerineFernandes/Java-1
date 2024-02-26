package inheritance3;
class Three
{
	static void Multiply()
	{
		System.out.println("Multiplication");
	}
	static void Divide()
	{
		System.out.println("Division");
	}
	
}
class Two extends Three
{
	void Print()
	{
		System.out.println("Print1");
	}
	void Execute()
	{
		System.out.println("Execute1");
	}
}

public class One extends  Two
{
	static void add()
	{
		System.out.println("Addition");
	}

	public static void main(String[] args)
	{
		add();
		Multiply();
		Divide();
		Two t1=new Two();
		t1.Print();
		t1.Execute();
		

	}

}
