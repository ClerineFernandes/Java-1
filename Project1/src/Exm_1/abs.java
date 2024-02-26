package Exm_1;
abstract class Mathematics
{
	abstract void add();
	abstract void multiply();
}

public class abs extends Mathematics
{

	public static void main(String[] args) 
	{
		abs a1=new abs();
		a1.add();
		a1.multiply();
		

	}

	
	void add() 
	{
		System.out.println("Add");
		
	}

	
	void multiply() 
	{
		System.out.println("Multiply");
	}

}
