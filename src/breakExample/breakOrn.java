package breakExample;

import java.util.Scanner;

public class breakOrn {
	
	public static void main(String args[])
	{
		int sayi,i=0;
		double ort,toplam=0;		
		
		Scanner girdi=new Scanner(System.in);
		
		System.out.println("Alt alta pozitif say�lar gireceksiniz ve negatif say� girene kadar onlar toplanacak. \nNegatif girdi�inizde, toplama �slem�n�n sonucu size verilecektir.");
		
		while(true) 
		{
			System.out.println("Sayi giriniz : ");
			sayi=girdi.nextInt();	
			
			if(sayi<0)
				{break;}
			
			toplam+=sayi;
			i++;		
		}
		
		System.out.println("Toplam� "+toplam+" olan "+i+" tane sayi girdiniz.");
		
		ort=toplam/i;
		
		System.out.println("Say�lar�n ortalamas� "+ort+"'d�r.");
		
	}
}
