package examples;

public class equalsExample {
	
	public static void main(String args[]) 
	{
		String ad="melisa";
		
		if(ad.equals("melisa"))
		{
			System.out.println("");
			System.out.println("String melisa dýr.1");
		}
		
		if (ad.equals("MELÝSA")) 
		{
			System.out.println("");
			System.out.println("String MELÝSA dýr.2");
		}
		
		if (ad.equalsIgnoreCase("MELÝSA")) 
		{
			System.out.println("");
			System.out.println("String MELÝSA dýr.3");
		}
	}
}
