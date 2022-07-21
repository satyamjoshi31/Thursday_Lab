class PrintNo
{
	public static void main(String args[])
	{
		int i;
		for(i=1; i<=100; i++)
		{
			int b = i%3;
			int c = i%5;
			if(b == 0 && c == 0)
			{
				System.out.println("DeepTech");	
			}
			else if(b == 0)
			{
				System.out.println("Deep");
			}
			else if(c == 0)
			{	 
				System.out.println("Tech");	
			}
			else
			{
				System.out.println(i);
			}
		}	
	}
}