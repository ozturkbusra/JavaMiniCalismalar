package examples;

public class equalsExample {
	
	public static void main(String args[]) 
	{
		String ad="melisa";
		
		if(ad.equals("melisa"))
		{
			System.out.println("");
			System.out.println("String melisa d�r.1");
		}
		
		if (ad.equals("MEL�SA")) 
		{
			System.out.println("");
			System.out.println("String MEL�SA d�r.2");
		}
		
		if (ad.equalsIgnoreCase("MEL�SA")) 
		{
			System.out.println("");
			System.out.println("String MEL�SA d�r.3");
		}
	}
}
