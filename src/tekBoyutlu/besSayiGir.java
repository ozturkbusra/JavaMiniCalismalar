package tekBoyutlu;

import java.util.Scanner;

public class besSayiGir {
	public static void main(String[] args) {
	/*Scanner girdi=new Scanner(System.in);
	
	int girilen,i,toplam=0;
	
	for(i=0;i<5;i++) {
		System.out.print("Bir say� giriniz : ");
	girilen=girdi.nextInt();
	toplam=toplam+girilen;
	}
	System.out.println(i+" tane say� girdiniz.\nToplamlar� "+toplam+"'d�r.");*/
		
	Scanner girdi=new Scanner(System.in);
	int i,toplam=0;
	int dizi[]=new int [6]; //6 elemanl� bir int dizisi tan�mlad�k
	
	for(i=0;i<=5;i++) {
	System.out.print("Bir say� giriniz : ");
	
	dizi[i]=girdi.nextInt();
	
	toplam=toplam+dizi[i];
	}
	System.out.println(i+" tane say� girdiniz.\nSay�lar�n toplam� "+toplam+"'d�r.");
	System.out.println("Dizinin 3. eleman� : "+dizi[2]);
	}	
}
