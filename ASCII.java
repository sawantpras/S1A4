import java.io.*;
public class ASCII
{
	public static void main(String args[]) throws Exception
	{
		for(char i='A';i<='Z';i++)
		{
			//System.out.println("Enter a character and find out the ascii value");
			byte b=(byte)i;
			System.out.println(i +" - "+ b);
	}
}
}