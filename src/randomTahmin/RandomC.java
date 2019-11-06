package randomTahmin;

import java.util.Random;
import java.util.Scanner;

public class RandomC {
	static int i=1;
	static Random r=new Random();
	static Scanner girdi=new Scanner(System.in);
	static String secenek="D";
	
	public static void main(String[] args) {		
		
		
		System.out.println("En fazla 3 kerede 1-100 arasýnda oluþturulan random sayýyý tahmin ediniz..\n");	
		
		fonk();

		while (secenek=="D") {
			
			switch (secenek) {
			case "D":
				fonk();	
				break;
		
			case "H":
				System.out.println("O zaman git pls.");
				secenek="D";
				break;
			}	
		}		
		
	}
	
	public static void fonk() {
		i=1;
		int sayi=r.nextInt(100);
		System.out.println("Oluþturulan sayi : "+sayi+"\n");
		
		int tahmin=girdi.nextInt();
		
		while (tahmin!=sayi&&i<3) {
			if (0>=tahmin||tahmin>=100) {
				System.out.print("Girilen tahmin 1-100 aralýðýnda degil. ");
			}
			else {
				System.out.println("Tekrar deneyiniz");
				tahmin=girdi.nextInt();	
				i++;
			}				
		}
		if (i==3) {
			System.out.println("Hakkýnýz bitti.");
	
		} else {
			System.out.println("Bildiniz.");
		}
		
		System.out.println("Devam etmek istiyor musunuz? 'D' 'H' ");
		secenek=girdi.next();
		
	}
}
