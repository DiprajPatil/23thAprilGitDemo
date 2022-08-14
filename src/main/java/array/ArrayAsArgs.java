package array;

public class ArrayAsArgs {
	
	public static void method1(int [] i)
	{
		i[3] = 30;
		for(int s:i)
		{
			System.out.println(s);
		}
	}
	
	public static void main(String[] args) {
		
		int h[] = new int[5];
		h[0] = 43;
		h[1] = 32;
		h[2] = 12;
		h[3] = 18;
		h[4] = 75;
		
		method1(h);
		
		
		
	}

}
