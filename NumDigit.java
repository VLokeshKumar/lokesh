import java.util.Scanner;


public class NumDigit 
{
	public static void main(String []args)
	{
Scanner sc=new Scanner (System.in);
System.out.println("Enter the number");
int num=sc.nextInt();
int a=num;
int c=0;

	for(int i=0;num>0;i++)
	{
		num=num/10;
		c++;
	}
	System.out.println("The number of digits in "+a+" is " +c);
}
}

