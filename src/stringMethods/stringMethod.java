package stringMethods;

public class stringMethod {
	
	public static void main(String args[])
	{
		String myString = "This is My world !";
		System.out.println("Metnimiz : "+myString+"\nMetnin uzunlu�u : "+myString.length());
		
		System.out.println(myString.substring(8,myString.length()));
		System.out.println(myString.substring(0,6));
		
		System.out.println("My'�n ba�lang�c indexi : "+myString.indexOf("My"));
		
		System.out.println("\nBu metinde a harfi var m�? ");
		
		if(myString.indexOf("a")==-1)
			System.out.println("Bu metinde a harfi yoktur."+" ("+myString.indexOf("a")+")");
		else
			System.out.println("Bu metinde a harfi vard�r."+" ("+myString.indexOf("a")+")");
	}
}
