package array;

public class Assignment2 {
	
	// WAP to reverse a string "This is my country".
	
	public static void main(String[] args) {
		
		String r = "This is my country";
	
		String r1[] = r.split(" ");
	
		for(int i=(r1.length)-1;i>=0;i--)
		{
			System.out.print(r1[i]+" ");
		}
	
		

	}

}
