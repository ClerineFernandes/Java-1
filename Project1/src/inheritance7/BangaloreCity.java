package inheritance7;
class Karnataka
{
	void ITHUB()
	{
		System.out.println("India");
	}
}

public class BangaloreCity extends Karnataka
{
	void ITHUB()
	{
		
		System.out.println("Silicon city of India");
		super.ITHUB();
	}
	public static void main(String[] args) 
	{
		BangaloreCity b1=new BangaloreCity();
		b1.ITHUB();
		
		
	}

}
