import java.util.*;
public class Power 
{
	public static void main(String []args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number ");
		int num=sc.nextInt();
		System.out.println("Enter the power");
		int pow=sc.nextInt();
		
		System.out.println("Enter the power of number is "+Math.pow(num, pow));
	}

}
