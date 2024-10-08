package mypkg;
import java.util.Scanner;
public class TwoDimensionArray {

	public static void main(String[] args) {
		int m,n,i,j;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter row and column size");
		m=sc.nextInt();
		n=sc.nextInt();
		int A[][]=new int[m][n];
		System.out.println("Enter Elements");
		for(i=0;i<m;i++)
		{
			for(j=0;j<n;++j)
{
	A[i][j]=sc.nextInt();
	
}
			
		}
		System.out.println("Array Elements");
		for(i=0;i<m;i++)
		{
			for(j=0;j<n;++j)
{
	System.out.print(A[i][j]+" ");
	
}
			System.out.println();
		
	}

}	}

	
