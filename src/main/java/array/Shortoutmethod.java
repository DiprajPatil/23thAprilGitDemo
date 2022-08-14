package array;

import java.util.Arrays;

public class Shortoutmethod {
	
	public static void main(String[] args) {
		
		int a[] = new int[5];
		
		a[0]= 60;
		a[1]= 10;
		a[2]= 80;
		a[3]= 2;
		a[4] = 8;
		
		Arrays.sort(a);
		int l = a.length;
		System.out.println(l);
		for(int a1:a)
		{
		System.out.println(a1);
		}
	System.out.println("second highest "+a[l-2]);

	}
	
	
	
	

}
