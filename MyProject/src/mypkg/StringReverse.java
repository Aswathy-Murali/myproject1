package mypkg;
import java.util.Scanner;
public class StringReverse {

	public static void main(String[] args) {
		String s1;
		String new1="";
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter string");
		s1=sc.next();
		System.out.println("Initial string  " + s1);
		int l=s1.length(); // Aswathy 7
		
		for(int i=(l-1);i>=0;--i)  // 6
		{
			new1=new1+s1.charAt(i);  //y
					}
		System.out.println("reverse string  " + new1);
	}

}
