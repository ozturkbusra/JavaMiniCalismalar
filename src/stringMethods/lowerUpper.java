package stringMethods;

public class lowerUpper {
	
	public static void main(String args[]) 
	{
		String kelime="ASLINDA HARFLER BUYUK",kelime2="asl�nda harfler kucuk";
		
		System.out.println("K���ltme : "+kelime.toLowerCase());
		System.out.println("B�y�ltme : "+kelime2.toUpperCase());
		
		
		String trimle="  Bo�luklar  ";
		
		System.out.println("\nBo�luklu : "+trimle);
		System.out.println("Bo�luksuz : "+trimle.trim());
	}

}
