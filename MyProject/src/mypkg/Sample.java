package mypkg;

public class Sample {

	public static void main(String[] args) {
	// Check 23 and 45 are equal
		int a=23,b=45;
	System.out.println((a==b)?("Equal"):("Not equal"));

	a=55;
	b=70;
	System.out.println((a<50) && (a<b));
	
	a=20;
	b=30;
	int c;
	System.out.println("before swap a="+ a + " b="+ b);
	
	c=a;
	a=b;
	b=c;
	System.out.println("After swap a="+ a + " b="+ b);
	
	a=17;	
	System.out.println("second digit " + (a%10));
	
	}

}
