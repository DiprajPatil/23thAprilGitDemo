package array;

public class SumOfTriplets {
	
	// WAP to subarray/triplets whose SUM is equals to 11.
	
	public static void main(String[] args) {
		
		int a[] = {1,6,4,8,2};
		
		for (int i=0;i<a.length;i++)
		{
			for (int j=i+1;j<a.length;j++)
			{
				for (int k=j+1;k<a.length;k++)
				{
					if (a[i]+a[j]+a[k]==11)
					{
						System.out.println("The Sum of subarray {"+a[i]+","+a[j]+","+a[k]+"} is 11");
					}
				}
			}
		}
		
	}

}
