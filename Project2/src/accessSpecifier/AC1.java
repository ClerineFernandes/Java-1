package accessSpecifier;

public class AC1 
{
	AC1 ()
	{
		System.out.println("1");
	}
	public void add()
	{
		System.out.println("2");
	}
	private void sub()
	{
		System.out.println("4");
	}
	protected void div()
	{
		System.out.println("5");
	}
	void mul()
	{
		System.out.println("6");
	}

	public static void main(String[] args)
	{
		AC1 a1=new AC1();
		a1.add();
		a1.div();
		a1.mul();
		a1.sub();
		new AC1();

	}

}
