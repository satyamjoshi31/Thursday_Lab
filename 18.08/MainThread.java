import java.util.Random;
class Square extends Thread
	{
		 int a;
		 Square(int a)
		{
 			this.a = a;
		}
		public void run()
		{
			int square = a*a;
			System.out.println("Square of the number is "+square);
			System.out.println("------------------------------------------------------------------");
		}
	}

class Cube extends Thread
	{
		int a;
		Cube(int a)
		{
			this.a = a;
		}
		public void run()
		{
			int cube = a*a*a;
			System.out.println("Cube of the number is "+cube);
			System.out.println("------------------------------------------------------------------");
		}
	}

class Number extends Thread
	{
		public void run()
		{
			Random random = new Random();
			 for(int i =0; i<20; i++)
			{
				int randomN = random.nextInt(100);
				System.out.println("The generated number is " + randomN);
				if (randomN%2==0)
				{
					Square s = new Square(randomN);
					s.start();
				}
				else
				{
				Cube c = new Cube(randomN);
				c.start();
				}
			try 
			{
				Thread.sleep(1000);
			}
			 catch (InterruptedException ex) 
			{
				System.out.println(ex);
			}
		}
	}

}

public class MainThread 
	{
		public static void main(String args[])
		{
			Number a = new Number();
			a.start();
		}
	}