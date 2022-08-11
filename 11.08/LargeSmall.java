class LargeSmall
{
	public static void main(String args[])
	{
		int large, small;
		int i;
		int a[] = new int[]{54, 342, 32, 233, 43, 6756, 2, 8, 52, 10};
		large=small=a[0];
		for(i=0; i<a.length; i++)
		{
			if(a[i]>large)
			large=a[i];

			if(a[i]<small)
			small=a[i];
		}

		System.out.println("The smallest number is " +small);
		System.out.print("The largest number is " +large);	
	}
}


