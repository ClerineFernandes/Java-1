package supercallingstatement;
class Two
{
	Two()
	{
		System.out.println("1");
	}
	
}
class One extends Two
{
	One()
	{
		System.out.println("2");
	}
	
}

public class Three extends One
{
	Three()
	{
		
		System.out.println("3");
	}
	public static void main(String[] args) 
	{
		new One();
		
	}

}
