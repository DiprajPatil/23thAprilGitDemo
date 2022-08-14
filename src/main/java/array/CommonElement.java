package array;

public class CommonElement {
	
	// WAP to find element common in all arrays
	
	public static void main(String[] args) {
		
		int a[] = {1,8,5,20,6};	
		int b[] = {23,8,85,24,6};	
		int c[] = {89,9,62,8,6};
		
		for (int i=0;i<a.length;i++)
		{
			for (int j=0;j<b.length;j++)
			{
				for(int k=0;k<c.length;k++)
				{
					if(a[i]==b[j] && a[i]==c[k] && b[i]==c[k])
					{
						System.out.println(a[i]+" is a common element form arrays");
					}
				}
			}
			
		}
		
	}

}
