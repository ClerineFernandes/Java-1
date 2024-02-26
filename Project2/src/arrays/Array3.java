package arrays;

public class Array3 {

	public static void main(String[] args) 
	{
		String name[]=new String[3];
		int rollno[]=new int[3];
		double salary[]=new double[3];
		name[0]="Clerine";
		rollno[0]=12;
		salary[0]=899989.89;
		
		name[1]="Celine";
		rollno[1]=13;
		salary[1]=799989.89;
		
		name[2]="Felix";
		rollno[2]=17;
		salary[2]=999989.89;
		
		for(int i=0;i<3;i++)
		{
			System.out.println(name[i]);
			System.out.println(rollno[i]);
			System.out.print(salary[i]);
			
		}
		

	}

}
