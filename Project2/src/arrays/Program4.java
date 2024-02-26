package arrays;

public class Program4 {

	public static void main(String[] args) {
		int num[]=new int[4];
		num[0]=233;
		num[1]=933;
		num[2]=243;
		num[3]=232;
	 int sum=0;
	 for(int i=0;i<num.length;i++)
	 {
		 sum=sum+num[i];
		 
	 }
	 System.out.println(sum);
	 double average=sum/num.length;
	 System.out.println(average);
	 

	}

}
