import java.util.*;
public class LeapYear 
{
	public static void main(String []args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the year");
		int year=sc.nextInt();
		if(year%4==0)
		{
			System.out.println("The give year is leap year");
		}
		else
		{
			System.out.println("The give year is not leap year");
		}


	}
	
}
