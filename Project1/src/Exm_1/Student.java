package Exm_1;
class Teacher
{
	static void gk()
	{
		System.out.println("General Knowledge");
	}
	
}

public class Student extends Teacher
{
	static void java()
	{
		System.out.println("Java");
	}

	public static void main(String[] args) 
	{
		gk();
		java();
		

	}

}
