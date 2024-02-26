package practicecodes;
class State_Class
{
	State_Class(int a)
	{
		System.out.println("1");
	}
}

public class Practice5 extends State_Class
{
	Practice5()
	{
		super(13);
		System.out.println("2");
	}

	public static void main(String[] args) 
	{
		new Practice5();
		

	}

}
