import java.io.*;
public class Alph 
{
public static void main(String []args) throws IOException
{
	BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
	System.out.println("Enter the char :");
char i,j;
int f=0;
	char a=(char) br.read();
	for(i='a',j='A';i<'z'&&j<'Z';i++,j++)
	{
		if(a==i || a==j)
		{
			f=1;
			break;
		}
		else
		{ 
			f=0;
			
		}
	}
	if(f==1)
	{
		System.out.println("The given character is alphabet");
	}
	else
	{
		System.out.println("The given character is not alphabet");
	}
}
}
