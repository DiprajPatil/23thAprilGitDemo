package array;

public class ArrayWithNew {
	
	public static void main(String[] args) {
		
		String [] p = new String[4];
		p[0] = "dipraj";
		p[1] = "milind";
		p[2] = "rahul";
		p[3] = "mahesh";
		
		System.out.println(p[2]);
		
		int a = p.length;
		System.out.println(a);
		
		for(int i=0;i<a;i++) 
		{
		  System.out.println(p[i]);
		} 
	
		
	}

}
