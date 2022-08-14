package string;

public class RemoveAlphabetsOrDigits {

	public static void main(String[] args) {
		
		// Remove Alphabets from string
		
		String s = "fk4ni36o82n5m8";
		
		String s1 = s.replaceAll("[A-Za-z]", "");
		
		System.out.println(s1);
		
		
		// Remove Digits from string
		
		String s2 = s.replaceAll("[0-9]", "");
		
		System.out.println(s2);
				
	}

}
