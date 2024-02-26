package example1;

public class Loop11 {

	public static void main(String[] args) throws InterruptedException {
		for(int i=100;i>0;i--)
		{
			System.out.println(i);
			Thread.sleep(2000);
		}

	}

}
