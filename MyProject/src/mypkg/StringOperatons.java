package mypkg;

public class StringOperatons {

	public static void main(String[] args) {
		String s1="Hello",s2="  hi",s3="Aswathy",s5="Hi my name is Aswathy";
		String s6="asasd fdgafd asdas eaw  e t dsfsdf as";
		System.out.println(s1.concat(s2)); //Hellohi
		System.out.println(s1.equals(s2));  //false
		System.out.println(s2.contains("i"));  //true
		System.out.println(s3.startsWith("a"));  //F
		System.out.println(s1.endsWith("o"));   //T
		System.out.println(s1.length());   //5
		System.out.println(s2); //--hi
		System.out.println(s2.trim());   //hi 
		System.out.println(s3.charAt(2));  //w
		System.out.println(s1.toUpperCase()); //HELLO
		System.out.println(s3.toLowerCase()); //aswathy
		System.out.println(s3.substring(3));  //athy
		System.out.println(s2.replace("h","mol")); //moli
		
		char [] c=s3.toCharArray();// A  s  w  a  t  h  y 
		for(char c1:c) {
			System.out.println(c1);
		}
		
		String s4[]=s5.split(" ");// each word in each line 
		for(String c1:s4) {
			System.out.println(c1);
		}
		
		String s7[]=s6.split("a");// each word in each line 
		for(String c1:s7) {
			System.out.println(c1);
		}

	}

}
