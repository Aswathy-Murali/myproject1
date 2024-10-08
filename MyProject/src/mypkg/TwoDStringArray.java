package mypkg;
import java.util.Scanner;
public class TwoDStringArray {

	public static void main(String[] args) {
	
int m,n,i,j;
Scanner sc=new Scanner(System.in);
System.out.println("Enter row and col length");
m=sc.nextInt();
n=sc.nextInt();
String A[][]=new String[m][n];
System.out.println("Enter String values");
for(i=0;i<m;++i)
{
	for(j=0;j<n;++j)
	{
		A[i][j]=sc.next();
	}
}
System.out.println("String values");
//for(i=0;i<m;++i)
//{
//	for(j=0;j<n;++j)
//	{
//		System.out.print(A[i][j]+" ");
//	}
//	System.out.println();
//}
for(String temp[]:A)
{
	for(String temp1:temp)
	{
		System.out.print(temp1+" ");
	}
	System.out.println();	
}
	}

}
