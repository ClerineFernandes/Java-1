package blocksInJava;

public class Block3 {
	
		Block3()
		{
			System.out.println("Im Constructor");
		}
	
	static
	{
		System.out.println("Im SIB");
	}
	{
		System.out.println("Im IIB");
	}

	public static void main(String[] args) {
		System.out.println("Im Main Method");
		new Block3();
		

	}

}
