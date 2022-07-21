import java.util.*;

class SumDigits
{
	public static void main(String []args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number - ");
		int ip = sc.nextInt();
		int a = ip;
		int sum = 0;
		while(a>0)
		{
			int b = a/10;
			sum = sum + a%10;
			a = b;
		}
		System.out.println("Sum of the digits of "+ip+" = "+ sum);		
	}
}