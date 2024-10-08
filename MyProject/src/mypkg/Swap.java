package mypkg;

public class Swap {

	public static void main(String[] args) {
		int a=30,b=20,c;
		System.out.println("Before swap ");
		System.out.println("a="+ a);
		System.out.println("b="+ b);
	//Using variable	
		c=a;
		a=b;
		b=c;
		
		System.out.println("After swap ");
		System.out.println("a="+ a);
		System.out.println("b="+ b);
		
	//without using variable
		int p=-2,q=6;
		System.out.println("Before swap ");
		System.out.println("p="+ p);  //
		System.out.println("q="+ q);  //
		
		p=p+q; //4
		q=p-q; //-2
		p=p-q; //6
		
		System.out.println("After swap ");
		System.out.println("p="+ p);  
		System.out.println("q="+ q);
	}

}
