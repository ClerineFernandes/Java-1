package abstractmethod;
abstract class Razorpay
{
	abstract void login();
	
}

public class Abstract1  extends Razorpay
{

	public static void main(String[] args) 
	{
		Abstract1 a1=new Abstract1();
		a1.login();

	}
	void login() 
	{
		System.out.println("Internal Logic");
		
	}

}
