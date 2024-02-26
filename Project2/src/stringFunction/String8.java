package stringFunction;

import java.util.Date;

public class String8 {

	public static void main(String[] args) {
		Date d1=new Date();
		System.out.println(d1.getTime());
		Date d2=new Date(d1.getTime()+(1000*60*60*24*1));
		System.out.println(d2);
		
		String mydate=d1.toString();
		System.out.println(mydate);
		String myday=mydate.substring(0, 3);
		System.out.println("Day :"+myday);
		String mymonth=mydate.substring(4, 7);
		System.out.println("Month:"+mymonth);
		String date=mydate.substring(8, 10);
		System.out.println("Date:"+date);
		String Year=mydate.substring(23);
		System.out.println("Year:"+Year);
		
		
		
	
		
		

	}

}
