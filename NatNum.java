import java.util.Scanner;
public class NatNum 
{
	public static void main(String []args)
	{
Scanner sc=new Scanner (System.in);
System.out.println("Enter the number");
int num=sc.nextInt();
int sum=0,i;
for(i=1;i<=num;i++)
{
	sum+=i;
}
System.out.println(sum);
}
}

