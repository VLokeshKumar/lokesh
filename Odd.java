
import java.util.Scanner;
import java.util.*;
public class Odd 
{

	public static void main(String []args)
	{
		Scanner sc=new Scanner (System.in);
		System.out.println("Enter the first number");
		int num1=sc.nextInt();
		System.out.println("Enter the second number");
		int num2=sc.nextInt();
		int i;
		System.out.println("The odd numbers between "+num1+" and "+num2+" are ");
		for(i=num1;i<num2;i++)
		{
			if(i%2!=0)
			{
				System.out.println(i);
			}
		}
	}
}

