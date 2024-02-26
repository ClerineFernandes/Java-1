package inheritance4;
class Teacher2
{
	void java()
	{
		System.out.println("Java");
	}
	void selenium()
	{
		System.out.println("Selenium");
	}
}

public class Student2 
{
	static void gk()
	{
		System.out.println("General Knowledge");
	}

	public static void main(String[] args)
	{
		Teacher2 T1=new Teacher2();
		T1.java();
		T1.selenium();
		gk();

	}

}
