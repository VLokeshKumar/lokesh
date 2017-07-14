import java.util.*;
public class AmsNum 
{
	public static void main(String []args)
	{
		Scanner sc=new Scanner (System.in);
		System.out.println("Enter the input:");
		int n=sc.nextInt();
		int num=n;
		int rem,sum=0,i,d=0,j,rem1;
		int pow=n%10;
	//	System.out.println("The sum of digits is:"+pow);
		if(n>9)
		{
			for(i=0;n>0;i++)
			{
				n=n/10;
				d++;
			}
			
			for(i=0;num>0;i++)
			{
				rem=num%10;
				rem1=rem*rem;
				for(j=2;j<pow;j++)
				{
					rem1=rem1*rem;
					
				}
				//System.out.println("The sum of digits is:"+rem1);
				sum+=rem1;
				num=num/10;
			}
			System.out.println("The sum of digits is:"+sum);
			
				
			
			//System.out.println("The sum of digits is:"+sum);
		}
		
		else
		{
			System.out.println("Enter a value greaterthan 9");
		}
		
	}
}
		
		
		
		
		


