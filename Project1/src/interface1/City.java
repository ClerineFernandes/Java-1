package interface1;
interface Country
{
	void countrycollection();//abstract method
}
abstract class State implements Country
{
	abstract void stateroad();
	void statecollection()
	{
		System.out.println("State Collection");
	}
}

public class City extends State
{
	 

	public static void main(String[] args) 
	{
		City c1=new City();
		c1.countrycollection();
		c1.stateroad();
		

	}


	public void countrycollection() 
	{
	System.out.println("Country Collection");
		
	}

	
	void stateroad() {
		System.out.println("State Road");
		
	}

}
