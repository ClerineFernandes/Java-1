package stringFunction;

public class String14 {

	public static void main(String[] args)
	{
		int array[]= {14,41,87,89};
		int temp=0;
		int search=41;
		for(int i=0;i<=3;i++)
		{
			if(search==array[i])
			{
				System.out.println("Number is present at index:"+i);
				temp++;
			}
		}
		
			if(temp==0)
			{
				System.out.println("Number is not found in an array");
			}
		}
	}
