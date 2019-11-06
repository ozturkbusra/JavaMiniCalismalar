package tekBoyutlu;

import java.util.Scanner;

public class DiziBoyutu {
	public static void main(String[] args) {
		int diziBoyutu=5;
		int [] dizi;
		dizi=new int[diziBoyutu];
		
		int i,toplam=0;
		
		Scanner girdi=new Scanner(System.in);
		
		for(i=0;i<diziBoyutu;i++) {
			
			System.out.print(i+". dizi elemanýný giriniz : ");
		dizi[i]=girdi.nextInt();
		
		toplam=toplam+dizi[i];
		
		}
		System.out.println("Toplam : "+toplam);
		
	}
}