package example1;

public class FinalVariable2
{
	final static double pi=3.14;
	static void circumferenceofcircle()
	{
		int r=14;
		System.out.println(2*pi*r);
	}
	public static void main(String[] args) 
	{
		int r=7;
		System.out.println(2*pi*r);
		circumferenceofcircle();
		
	}
		
}





		