package inheritance4;
 class Teacher1
{
	void java()
	{
		System.out.println("Java");
	}
	void Selenium()
	{
		System.out.println("Selenium");
	}

}

public class Student1 extends Teacher1
{
	 void gk()
	{
		System.out.println("General Knowledge");
	}
	public static void main(String[] args) {
		
		Student1 s1=new Student1();
		s1.java();
		s1.Selenium();
		s1.
		gk();
		

	}

}
