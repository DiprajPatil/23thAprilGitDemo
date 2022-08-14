package array;

public class Assignment1 {
	
	// WAP to print the addition of all the even elements of an int array .
	
	public static void main(String[] args) {
		
		int g [] = {32,12,56,32,53};
		
		int sum = 0;
		
		for(int i=0;i<g.length;i++)
		{
			if(i%2==0)
			{
				sum = sum + g[i];
			}
		}
		System.out.println("Addition of even element of an int array is = "+sum);
	}
}


