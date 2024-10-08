package mypkg;

public class Q9 {

	public static void main(String[] args) {
		String s1="Hi my name is Aswathy Murali, IAm from Ernakulam";
		int c=0;
	 String s=s1.toLowerCase();
	for(int i=0;i<s.length();++i)
		{
		if(s.charAt(i) == 'a' || s.charAt(i) == 'e'|| s.charAt(i) == 'i'|| s.charAt(i) == 'o' ||s.charAt(i) == 'u')
		
				{
					c++;
				}	
		}
	System.out.println("Number of vowels" +c);
	}

} 
