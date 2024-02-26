package inheritance1;
class Teacher
{
	static void selenium()
	{
		System.out.println("Selenium");
	}
	static void Java() {
		System.out.println("Java");
	}
	
}
public class Student extends Teacher
{
	static void GK()
	{
		System.out.println("General knowledge");
	}
public static void main(String[] args) 
{
	GK();
	selenium();
	Java();
}
}
