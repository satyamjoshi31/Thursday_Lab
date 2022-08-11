import java.util.ArrayList;
import java.util.List;

public class DupRemove 
{
	public static void main(String[] args) 
	{
		List<String> names = new ArrayList<>();
		names.add("Rajesh");
		names.add("Sheldon");
		names.add("Leonard");
		names.add("Howard");
		names.add("Penny");
		names.add("Amy");
		names.add("Stuart");
		names.add("Rajesh");
		names.add("Stuart");
		names.add("Sheldon");
		names.add("Sheldon");
		
		System.out.println("List containing duplicate names - " + names);
		List<String> names2 = new ArrayList<>();	
		for(String ele:names) 
		{
			if(!names2.contains(ele)) 
			{
				names2.add(ele);
			}
		}
		System.out.println("List after removing duplicate names - " + names2);
	}

}