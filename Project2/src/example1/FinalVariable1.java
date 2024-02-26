package example1;

public class FinalVariable1

{
	final static double pi=3.14;
	static void areaofcircle()
	{
		int r=14;
		System.out.println(pi*r*r);
	}
	

	public static void main(String[] args) 
	{
		int r=7;
		System.out.println(pi*r*r);
		areaofcircle();
		

	}

}
