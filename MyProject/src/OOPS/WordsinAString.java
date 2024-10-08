package OOPS;

public class WordsinAString {

	public static void main(String[] args) {
		String str="hi My name is Aswathy, How are you?";
		System.out.println("Number of chars="+str.length());
		int c=0;
		String s[]=str.split(" ");// each word in each line 
		
		System.out.println("Number of words="+s.length);
	}

}
