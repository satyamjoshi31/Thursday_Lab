import java.util.ArrayList;
import java.util.List;

public class ArrayListOp 
{

	public static void main(String[] args) 
	{
		List<String> list = new ArrayList<String>();
		list.add("Sheldon");
		list.add("Rajesh");
		list.add("Howard");
		list.add("Leonard");
		list.add("Stuart");
		list.add("Barry");
		System.out.println("Original list of names - " + list);
		list.add("Penny");
		list.add("Amy");
		System.out.println("List after adding names - " + list);
		list.remove(4);
		list.remove(5);
		
		System.out.println("List after removing names - " + list);
	}

}