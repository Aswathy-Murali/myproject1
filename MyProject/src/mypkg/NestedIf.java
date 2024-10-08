package mypkg;

public class NestedIf {

	public static void main(String[] args) {
		int age=14,w=53;
		if(age>=18) {
			if(w>=55) {
					System.out.println("Eligilble for blood donation");
			          }
			else
					{
					System.out.println(" Sorry!! You are under weight");
					}
		}
		else {
			System.out.println(" Your age and weight not satisfy the criteria");
		}
	}

}
