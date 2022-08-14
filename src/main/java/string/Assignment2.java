package string;

public class Assignment2 {
	
//	WAP to print all the characters of a String with their index position --> example: char c is at 0th position.
	
	public static void main(String[] args) {
		
		String a = "maharashtra";
		int t = a.length();
		
		for(int i=0;i<t;i++)
		{
			char  a2 =a.charAt(i);
			 if(a2=='a')
			 {
				 System.out.println("character "+a2+" is at "+i+"th position");
			 }
  
		}
	}
}
