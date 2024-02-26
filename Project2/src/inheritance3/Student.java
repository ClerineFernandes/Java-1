package inheritance3;
class Teacher
{
	void Selenium()
	{
		System.out.println("Selenium");
	}
	void Java() {
		System.out.println("Java");
	}
}

public class Student extends Teacher
{
	static void GK()
	{
		System.out.println("General Knowledge");
	}

	public static void main(String[] args)
	{
		 Student s1=new  Student();
		 s1.Java();
		 s1.Selenium();
		 GK();
	}

}
