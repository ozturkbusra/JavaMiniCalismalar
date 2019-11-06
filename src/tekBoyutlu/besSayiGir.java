package tekBoyutlu;

import java.util.Scanner;

public class besSayiGir {
	public static void main(String[] args) {
	/*Scanner girdi=new Scanner(System.in);
	
	int girilen,i,toplam=0;
	
	for(i=0;i<5;i++) {
		System.out.print("Bir sayý giriniz : ");
	girilen=girdi.nextInt();
	toplam=toplam+girilen;
	}
	System.out.println(i+" tane sayý girdiniz.\nToplamlarý "+toplam+"'dýr.");*/
		
	Scanner girdi=new Scanner(System.in);
	int i,toplam=0;
	int dizi[]=new int [6]; //6 elemanlý bir int dizisi tanýmladýk
	
	for(i=0;i<=5;i++) {
	System.out.print("Bir sayý giriniz : ");
	
	dizi[i]=girdi.nextInt();
	
	toplam=toplam+dizi[i];
	}
	System.out.println(i+" tane sayý girdiniz.\nSayýlarýn toplamý "+toplam+"'dýr.");
	System.out.println("Dizinin 3. elemaný : "+dizi[2]);
	}	
}
