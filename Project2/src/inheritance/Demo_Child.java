package inheritance;
class Demo_Parent
{
	void add()
	{
		System.out.println("Addition1");
	}
	
}

public class Demo_Child extends Demo_Parent
{
	void add()
	{
		super.add();
		System.out.println("Addition2");
	}
	

	public static void main(String[] args) 
	{
		Demo_Child d1=new Demo_Child();
		d1.add();

	}

}
