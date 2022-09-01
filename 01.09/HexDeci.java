public class HexDeci
{
	public static void main(String[] args)
	{
		String hex = "0F";
		int deci = Integer.parseInt(hex, 16);
		System.out.println("The given Hexadecimal number is "+ hex +" and it's decimal representation is "+ deci);
	}
}