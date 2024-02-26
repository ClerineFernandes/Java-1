package inheritance1;
class Teacher
{
static void Selenium()
{
	System.out.println("selenium");
}
static void java()
{
	System.out.println("java");
}

public class Student extends  Teacher
{
	static void gk()
	{
		System.out.println("General");
	}

	public static void main(String[] args) 
	{
		gk();
		java();
	}
}
}


