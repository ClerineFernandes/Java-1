package methodOverrding;
abstract class RazorpayApi //abstract class
{
	abstract void login(); //abstract method
}

public class Abstract extends RazorpayApi
{

	public static void main(String[] args) 
	{
		
		RazorpayApi R1=new Abstract();
		R1.login(); 
	}

	
	void login() 
	{
		System.out.println("Razorpay");
		
	}

}
