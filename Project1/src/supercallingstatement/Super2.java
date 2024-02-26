package supercallingstatement;
class One1
{
	One1()
	{
		System.out.println("1");
	}
}
class Two2 extends One1
{
	Two2()
	{
		System.out.println("2");
	}
	
}

public class Super2
{
	Super2()
	{
		System.out.println("3");
	}

	public static void main(String[] args) {
		new Two2();
		

	}

}
