package arrays;

public class Example17 {

	public static void main(String[] args)
	{
		int num[]=new int[4];
		num[0]=78;
		num[1]=83;
		num[2]=88;
		num[3]=98;
		int sum=0;
		for(int i=0;i<num.length;i++)
		{
			sum=sum+num[i];
		
		}
		System.out.println(sum);
		double average=sum/num.length;
		System.out.println(average);
		double reminder=sum%num.length;
		System.out.println(reminder);
		
		

	}

}
