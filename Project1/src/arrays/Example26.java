package arrays;

public class Example26 {

	public static void main(String[] args) {
		int num[]= {54,78,78,67};
		int rollno=45;
		for(int i=0;i<=3;i++)
		{
			if(rollno==num[i])
			{
				System.out.println("Present:"+num[i]);
			}
			else
			{
				System.out.println("Not Present");
			}
		}

	}

}
