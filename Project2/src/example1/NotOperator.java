package example1;

public class NotOperator {

	public static void main(String[] args) 
	{
		int a=20;
		int b=30;
		if(!(a>5 && b==a))
		{
			System.out.println("NOT Operator");
		}
		if(!(a>4 || b==a))
		{
			System.out.println("OR Operator");
		}
		

	}

}
