package string;

public class Assignment3 {
	
//	WAP to print the characters of String which are present at even position.

	public static void main(String[] args) {
		
		String a = "kedarnath";
		int t = a.length();
		
		for(int i=0;i<t;i++)
		{
			if(i%2==0)
			{
				char a2 = a.charAt(i);
				System.out.print(a2);
			}
		}
	}

}
