package practicecodes;


public class Practice7 
{
	int age;
	String name;
	double salary;
	void student_details(int age, String name,double salary)
	{
		this.age=age;
		this.name=name;
		this.salary=salary;
		System.out.println("Execute");
	}
	public static void main(String[] args) 
	{
		Practice7 a1=new Practice7();
		a1.student_details(23, "Clerine",28.89);
		System.out.println(a1.age);
		System.out.println(a1.name);
		System.out.println(a1.salary);
	
	}

}
