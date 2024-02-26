package inheritance5;
class Grandfather
{
   void add()
   {
	   System.out.println("Addition");
   }
}
   class Father extends Grandfather
   {
	   void subtract()
	   {
		   System.out.println("Substraction");
	   }
   }


public class Daughter extends  Father
{
	void multiply()
	{
		System.out.println("Multiplication");
	}

	public static void main(String[] args) 
	{
		Daughter d1=new Daughter();
		d1.add();
		d1.subtract();
		d1.multiply();
		

	}

}
