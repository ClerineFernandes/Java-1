package practicecodes;
class Class1
{
	Class1()
	{
		System.out.println("1");
	}
}
class Class2 extends Class1
{
	Class2()
	{
		System.out.println("2");
	}
}

public class Class3 
{
	 Class3()
	 {
		 System.out.println("3");
	 }

	public static void main(String[] args) 
	{
		new Class2();
		

	}

}
