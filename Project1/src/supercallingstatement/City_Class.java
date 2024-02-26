package supercallingstatement;
class State_Class
{
	State_Class(String a)
	{
		System.out.println("1");
	}
	
}


public class City_Class extends State_Class
{
	City_Class()
	{
		super("Clerine");
		
		System.out.println("2");
	}
	public static void main(String[] args) 
	{
		City_Class c1=new City_Class();
		
	}

}
