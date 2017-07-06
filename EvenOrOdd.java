import java.util.*;
public class EvenOrOdd 
{
	public static void main(String []args)
	{
		Scanner sc=new Scanner (System.in);
		int num=sc.nextInt();
		if(num%2==0)
			System.out.println("It is even number");
		else
			System.out.println("It is odd number");
	}
}
