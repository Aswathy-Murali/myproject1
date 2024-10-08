package mypkg;
import java.util.Scanner;
public class ScannerClass {

	
	public static void main(String[] args) {
	
Scanner sc=new Scanner(System.in);
System.out.println("Enter A number ");
int a= sc.nextInt();
System.out.println("number ="+a);

System.out.println("Enter A string (no space)");
String c=sc.next();
System.out.println("String is ="+c);

//System.out.println("Enter A string");
//String c1=sc.nextLine();
//System.out.println("String is ="+c1);

System.out.println("Enter a character");
char s=sc.next().charAt(0);
System.out.println("Character is ="+s);
	}

}
