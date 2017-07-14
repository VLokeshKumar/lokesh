import java.util.Scanner;
import java.util.Scanner;

public class PrimeBwNum {

	public static void main(String []args)
	{
		Scanner sc=new Scanner (System.in);
		System.out.println("Enter the first number");
		int num1=sc.nextInt();
		System.out.println("Enter the second number");
		int num2=sc.nextInt();
		System.out.println("The prime numbers between "+num1+" and "+num2+" are ");
		int f=0,j;
		for(j=num1;j<=num2;j++)
		{
			
			for(int i=2;i<j/2;i++)
			{
				if(j%i==0)
				{
					f=1;
					break;
				}
				else
				{
					f=0;
				}
				
			}
			if(f==0)
			{
				System.out.println(j);
				
			}
			
		}
	}
}





