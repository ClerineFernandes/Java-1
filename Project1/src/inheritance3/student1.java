package inheritance3;

class Master
{
	 void Selenium()
	{
		System.out.println("selenium");
	}
	 void java()
	{
		System.out.println("java");
	}
}

public class student1 extends Master
{
	 public void gk()
	{
		System.out.println("General");
	}

	public static void main(String[] args)
	{
		Master a1=new Master();
		
		a1.Selenium();
		a1.java();
	
	}
}
