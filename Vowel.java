import java.io.*;
public class Vowel 
{
	public static void main(String []args) throws IOException
	{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter the char :");

		char a=(char) br.read();
		
		if(a=='a' || a=='e' || a=='i'||a=='o'|| a=='u'||a=='A' || a=='E' || a=='I'||a=='O'|| a=='U')
		{
			System.out.println("The given character is vowel");
		}
		else
		{
			System.out.println("The given character is not vowel");
		
		}
	}
