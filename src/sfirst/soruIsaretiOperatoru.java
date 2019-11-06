package sfirst;

import java.util.Scanner;
import java.io.IOException;

public class soruIsaretiOperatoru {
	
	public static void main(String args[]) throws IOException
	{
		
		Scanner girdi=new Scanner(System.in);
		double not;
		
		String sonuc;
		
		
		System.out.print("Sýnav notunu 1-100 arasý giriniz : ");
		not=girdi.nextDouble();
		
		sonuc=not>=50 ? "Basarýlý..":"Basarýsýz..";
		
		System.out.println("Sonuc : "+sonuc);		
	}
}
