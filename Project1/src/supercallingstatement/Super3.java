package supercallingstatement;

public class Super3 
{
	int age;
	String name;
	double salary;
	void student_details(int age, String name,double salary)
	{
		this.age=age;
		this.name=name;
		System.out.println("Student Details");
	}

	public static void main(String[] args)
	{
		
		Super3  s1=new Super3();
		s1.student_details(20,"Clerine",9.80);
		System.out.println(s1.age);
		System.out.println(s1.name);
		System.out.println(s1.salary);

	}

}
