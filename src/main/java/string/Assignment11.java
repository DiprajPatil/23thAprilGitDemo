package string;

public class Assignment11 {
	
	/*  WAP to add all the number individually from the String for example
	    if the string is “ab5ds51s2” then output should be 5+5+1+2 = 13)    */
	
	public static void main(String[] args) {
		
		String s = "ab5ds51s2";
		
		int a = 0;
		for (int i=0;i<s.length();i++)
		{
			char c = s.charAt(i);
			boolean b = Character.isDigit(c);
			if (b==true)
			{
				a = a+Character.getNumericValue(c);
			}
		}
		System.out.println("The sum of the digits in given string is = "+a);
	}

}
