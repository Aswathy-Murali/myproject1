package mypkg;
import java.util.Scanner;
public class ArrayBasic {

	public static void main(String[] args) {
		int n;
		int [] A=new int[30];
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter size of array");
		n=sc.nextInt();
		System.out.println("Enter Elsements");
		for(int i=0;i<n;++i)
		{
			A[i]=sc.nextInt();
		}
		System.out.println("Array Elements");
		for(int i=0;i<n;++i)
		{
			System.out.print(A[i]+" ");
		}
		

	}

}
