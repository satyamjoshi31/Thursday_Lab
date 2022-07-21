class Student
{
	public static void main(String []a)
	{
		String name = "Sheldon Cooper";
		String address = "2311 North Los Robles Avenue, Pasadena, California";
		long phone_no =  9093566049l;
		char gender = 'M';
		String dob = "26/02/1980";
		float height = 1.86f; //m
		float weight = 66.5f; //kg
		String degree = "PhD";
		short year = 1996;
		float avg_gpa = 10.00f;
		boolean ttn_grant = true;
		boolean scholar = true;

		System.out.println("Name - " +name);
		System.out.println("Address - " +address);
		System.out.println("Phone No. - " + phone_no);
		System.out.println("Gender - "+ gender);
		System.out.println("Date Of Birth - "+ dob);
		System.out.println("Height - " + height + " m");
		System.out.println("Weight - "+ weight + " kg");
		System.out.println("Degree - "+ degree);
		System.out.println("Study Year - " + year);
		System.out.println("Average GPA - " + avg_gpa);
		System.out.println("Tuition Grant - " +ttn_grant);
		System.out.println("Scholar - " + scholar);
	}	
}