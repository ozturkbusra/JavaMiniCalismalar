package sfirst;

import java.util.Scanner;
import java.io.IOException;

public class soruIsaretiOperatoru {
	
	public static void main(String args[]) throws IOException
	{
		
		Scanner girdi=new Scanner(System.in);
		double not;
		
		String sonuc;
		
		
		System.out.print("S�nav notunu 1-100 aras� giriniz : ");
		not=girdi.nextDouble();
		
		sonuc=not>=50 ? "Basar�l�..":"Basar�s�z..";
		
		System.out.println("Sonuc : "+sonuc);		
	}
}
