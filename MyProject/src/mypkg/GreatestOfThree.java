package mypkg;

public class GreatestOfThree {

	public static void main(String[] args) {
		int a=52,b=51,c=55;
		if((a>b) && (a>c) ) {
				System.out.println(" a is greater");
			}
		
		else if((b>c) && (b>a)) {
				System.out.println(" b is greater");
			}
		else {
			System.out.println(" c is greater");
		}
	}

}
