package inheritance;
class Karnataka
{
	void  ITHUB()
	{
		System.out.println("Logic1");
	}
}

public class BangaloreCity extends Karnataka
{
	void ITHUB()
	{
		
		System.out.println("Logic2");
		super.ITHUB();
	}

	public static void main(String[] args)
	{
		BangaloreCity b1=new BangaloreCity();
		b1.ITHUB();
		
	}

}
