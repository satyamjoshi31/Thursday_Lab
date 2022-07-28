abstract class Marks
{
	float perc;
	abstract void getPercentage();
}
class A extends Marks
{
	
	A(float maths, float science, float english)
	{
		
		perc = (maths+science+english)/3;
	}
	
	
	public void getPercentage()
	{
		System.out.println("Percentage of student A = " + perc); 
	}
	public static void main(String []args)
	{
		A stu1 = new A(75, 99, 99);
		stu1.getPercentage();
		B stu2 = new B(88, 99, 77, 97);
		stu2.getPercentage();
	}

}
class B extends Marks
{
	B(float maths, float science, float english, float SST)
	{
		perc = (science+english+science+SST)/4;
	}
	void getPercentage()
	{
		System.out.println("Percentage of student B = " + perc);
	}
}