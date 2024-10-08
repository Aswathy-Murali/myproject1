package mypkg;
import java.util.Scanner;
public class StringArray {

	public static void main(String[] args) {
		int n,i;
		String [] A=new String[30];
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter size of array");
		n=sc.nextInt();
		System.out.println("Enter Names");
		for(i=0;i<n;++i)
		{
			A[i]=sc.next();
		}
		System.out.println("Names");
		for(i=0;i<n;++i)
		{
			System.out.println(A[i]);
		}
		
	}

}
