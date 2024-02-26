package polymorphism_Encapsulation;
class Student_Data
{
	private int age=18;

	public int getAge() 
	{
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}
}

public class Encapsulation3 
{

	public static void main(String[] args) 
	{
		Student_Data s1=new Student_Data();
		s1.setAge(20);
		System.out.println(s1.getAge());

	}

}
