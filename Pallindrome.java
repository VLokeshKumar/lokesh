import java.util.Scanner;


public class Pallindrome 
{
	public static void main(String []args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number ");
		int num=sc.nextInt();
		int sum=0;
		int num1=num;
		for(int i=0;num>0;i++)
		{
			int a=num%10;
			sum=(sum*10)+a;
			num=num/10;
		}
		if(num1==sum)
		{
			System.out.println("The given number is pallindrome" );
		}
		else
		{
			System.out.println("The given number is not pallindrome" );
		}
		
		
	}

}
