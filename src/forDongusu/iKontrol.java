package forDongusu;

import java.util.Scanner;

public class iKontrol {
	public static void main(String args[])
	{
		Scanner girdi=new Scanner(System.in);
		int sayi,i;
		int toplam=0;
		
		System.out.println("Kaça kadar toplansýn?");
		sayi=girdi.nextInt();
		
		for(i=1;i<=sayi;i++)
		{
			toplam=toplam+i;
		}
		
		System.out.println(sayi+"'e kadar olan sayýlarýn toplamý = "+toplam);
		System.out.println("i = "+i);
	}

}
