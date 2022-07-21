class PaulNote
{
	// Specifications of Notebook
	
	public static void main(String []a)
	
	{
		String brand = "idol";
		float speed = 2.66f; //GHz
		byte RAM = 8; //GB
		short memory = 500; //GB
		byte monitor = 15; //inch
		char service_plan = 'C'; 
		boolean on_site_service = true;
		boolean ext_warranty = false;
		float cost = 1760.55f; //$

		System.out.println("SPECIFICATIONS OF NOTEBOOK");
		System.out.println("Brand = "+ brand);
		System.out.println("Speed = "+ speed + " GHz");
		System.out.println("RAM = " + RAM + " GB");
		System.out.println("Memory = "+ memory+ " GB");
		System.out.println("Monitor = " + monitor + " inch");
		System.out.println("Service Plan = "+ service_plan );
		System.out.println("On-Site Servicing = "+ on_site_service);
		System.out.println("Extended Warranty = "+ ext_warranty);
		System.out.println("Cost = "+ cost + "$");	

	}	
}
