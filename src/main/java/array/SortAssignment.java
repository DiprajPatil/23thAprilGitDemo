package array;

public class SortAssignment {
	
	public static void main(String[] args) {
		
		int a[] = new int[5];
		
		a[0]= 60;
		a[1]= 10;
		a[2]= 80;
		a[3]= 2;
		a[4] = 8;
		
		for(int i=0;i<a.length;i++)
		{
			for(int j=i+1;j<a.length;j++)
			{
				 if(a[i]>a[j])
				 {
					 int temp;
					 temp=a[j];
					 a[j]=a[i];
					 a[i]=temp;
				 }
			}
		}
		for(int aa:a)
		{
			System.out.println(aa);
		}
		System.out.println("Second higest number is "+a[a.length-2]);
	}

}
