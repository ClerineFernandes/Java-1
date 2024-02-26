package inheritance4;
class Teacher
{
	static void selenium()
	{
		System.out.println("selenium");
	}
	static void java()
	{
		System.out.println("java");
	}
}
	

public class Student extends Teacher
{
	static void gk()
	{
		System.out.println("General Knowledge");
	}
	
	public static void main(String[] args) {
		gk();
		selenium();
		java();
		

	

}}
