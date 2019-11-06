package breakExample;

import java.util.Scanner;

public class breakOrn {
	
	public static void main(String args[])
	{
		int sayi,i=0;
		double ort,toplam=0;		
		
		Scanner girdi=new Scanner(System.in);
		
		System.out.println("Alt alta pozitif sayýlar gireceksiniz ve negatif sayý girene kadar onlar toplanacak. \nNegatif girdiðinizde, toplama ýslemýnýn sonucu size verilecektir.");
		
		while(true) 
		{
			System.out.println("Sayi giriniz : ");
			sayi=girdi.nextInt();	
			
			if(sayi<0)
				{break;}
			
			toplam+=sayi;
			i++;		
		}
		
		System.out.println("Toplamý "+toplam+" olan "+i+" tane sayi girdiniz.");
		
		ort=toplam/i;
		
		System.out.println("Sayýlarýn ortalamasý "+ort+"'dýr.");
		
	}
}
