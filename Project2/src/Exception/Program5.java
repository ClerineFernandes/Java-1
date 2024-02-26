package Exception;

public class Program5 
{
	void add() throws ArithmeticException, InterruptedException
	{
		Thread.sleep(2000);
		throw new ArithmeticException();
	}

	public static void main(String[] args)
	{
		throw new NullPointerException("You are a kid");

	}

}
