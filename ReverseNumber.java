import java.util.*;
public class ReverseNumber 
{
	public static void main(String []args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number to be reversed ");
		String num=sc.next();
		StringBuilder sb=new StringBuilder(num);
	    sb.reverse();
		System.out.println("The reversed number is "+sb);
	}

}
