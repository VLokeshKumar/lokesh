import java.util.*;
import java.io.*;
public class Multiplication_Table 
{
	public static void main(String []args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number for which u have to generate mulltiplication table");
		int num=sc.nextInt();
		System.out.println("Enter the limit until which u  have to generate mulltiplication table");
		int n=sc.nextInt();
		int i;
		int []table=new int[n];
		for(i=0;i<n;i++)
		{
			table[i]=(i+1)*num;
		}
		System.out.println("The Mulltiplication table is as follows");
		for(i=0;i<n;i++)
		{
			System.out.println((i+1)+" * "+num+" = "+table[i]);
		}
		
	}

}
