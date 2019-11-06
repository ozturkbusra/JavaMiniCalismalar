package examples;

public class charAt {

	public static void main(String args[]) 
	{
		String kelime="Avrupa";
		int i;
		
		System.out.println("KARAKTER         ÝNDEKSÝ");
		
		for(i=0;i<=kelime.length();i++) 
		{
			System.out.println("    "+kelime.charAt(i)+"               "+i);
		}
	}
}
