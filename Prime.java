import java.util.Scanner;


public class Prime 
{		public static void main(String []args)
		{
	Scanner sc=new Scanner (System.in);
	System.out.println("Enter the number");
	int num=sc.nextInt();
	int f=0;
	for(int i=2;i<num/2;i++)
	{
		if(num%i==0)
		{
			f=1;
			break;
		
		
			
	}

	}
	if(f==0)
	{
		System.out.println("The number is prime");
	}
	else
	{
		System.out.println("The number is not prime");
	}
	}


}
