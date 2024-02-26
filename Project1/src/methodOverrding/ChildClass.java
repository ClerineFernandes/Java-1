package methodOverrding;
class ParentClass
{
	 void add()
	{
		System.out.println("Addition");
	}
	
}

public class ChildClass extends ParentClass
{
	void add()
	
	{
		super.add();
		System.out.println("Addition1");
		
	}

	public static void main(String[] args) 
	{
		 ChildClass  c1=new  ChildClass ();
		 c1.add();

	}

}
