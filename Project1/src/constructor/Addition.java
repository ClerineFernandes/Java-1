package constructor;

public class Addition {
	Addition()
	{
		System.out.println("Constructor");
	}
	Addition(int a)
	{
		System.out.println("Clerine");
	}
	void add()
	{
		System.out.println("Hello");
	}
	static void subtract()
	{
		System.out.println("hi");
	}

	public static void main(String[] args) {
		new Addition();
		System.out.println("Main Method1");
		new Addition();
		new Addition();
		new Addition(10);
		Addition a1=new Addition();
		a1.add();
		
		System.out.println("Main Method2");
		subtract();
		
		
		

	}

}
