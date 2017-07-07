import java.util.*;
public class Largest 
{
	public static void main(String []args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the first number");
		int n1=sc.nextInt();
		System.out.println("enter the second number");
		int n2=sc.nextInt();
		System.out.println("enter the third number");
		int n3=sc.nextInt();
		if(n1>n2 && n1>n3)
		{
			System.out.println("The "+n1+" is largest number");
		}
		else if(n2>n3)
		{
			System.out.println("The "+n2+" is largest number");
		}
		else
		{
			System.out.println("The "+n3+" is largest number");
		}
				
	}

}
