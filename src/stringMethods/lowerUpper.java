package stringMethods;

public class lowerUpper {
	
	public static void main(String args[]) 
	{
		String kelime="ASLINDA HARFLER BUYUK",kelime2="aslýnda harfler kucuk";
		
		System.out.println("Küçültme : "+kelime.toLowerCase());
		System.out.println("Büyültme : "+kelime2.toUpperCase());
		
		
		String trimle="  Boþluklar  ";
		
		System.out.println("\nBoþluklu : "+trimle);
		System.out.println("Boþluksuz : "+trimle.trim());
	}

}
