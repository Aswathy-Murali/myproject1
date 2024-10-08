package OOPS;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class ExceptionBasics {

	public static void main(String[] args) throws FileNotFoundException {
		FileInputStream fi=new FileInputStream("E://Book1.xlsx");
		
	try {
		
		int a=9,b=0,c;
		c=a/b;
		
	
	}catch(ArithmeticException e)
	{
		System.out.println(e.getMessage());
		System.out.println("Arithmetic");
	}

try
{
	String s=null;
	System.out.println(s.length());
}
catch(Exception e)
{
	System.out.println(e.getMessage());
	System.out.println("Null poiter");
}
	

			

	}

}
