package typecasting;

class Excelsheet
{
	void Datafetching()
	{
		System.out.println("Hello");
	}
}

public class Testcase1 extends Excelsheet
{
	void  LogintintoLogout()
	{
	System.out.println("Hi");	
	}

	public static void main(String[] args) 
	{
		Excelsheet e1=new Testcase1();
		e1.Datafetching();
		Testcase1  t1= (Testcase1)e1;
		
		t1.LogintintoLogout();
	}

}
