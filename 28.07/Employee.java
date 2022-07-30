class Employee
{
	String n, a;
	int y, s;
	Employee(String name, int year, String address, int salary)
	{
		this.n = name;
		this.y = year;
		this.a = address;
		this.s = salary;
	}
	void display()
	{
		System.out.println(n+"			"+y+"			"+a);
	}
	public static void main(String[] args)
	{
		Employee E1 = new Employee("Robert", 1994, "64C Wall Street", 50);
		Employee E2 = new Employee("Sam", 2000, "68D Wall Street", 50);
		Employee E3 = new Employee("John", 1999, "26B Wall Street", 50);
		System.out.println("Name		Year of Joining			Address");
		E1.display();
		E2.display();
		E3.display();
	}
}