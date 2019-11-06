package stringMethods;

public class stringMethod {
	
	public static void main(String args[])
	{
		String myString = "This is My world !";
		System.out.println("Metnimiz : "+myString+"\nMetnin uzunluðu : "+myString.length());
		
		System.out.println(myString.substring(8,myString.length()));
		System.out.println(myString.substring(0,6));
		
		System.out.println("My'ýn baþlangýc indexi : "+myString.indexOf("My"));
		
		System.out.println("\nBu metinde a harfi var mý? ");
		
		if(myString.indexOf("a")==-1)
			System.out.println("Bu metinde a harfi yoktur."+" ("+myString.indexOf("a")+")");
		else
			System.out.println("Bu metinde a harfi vardýr."+" ("+myString.indexOf("a")+")");
	}
}
