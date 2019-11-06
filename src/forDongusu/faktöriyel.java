package forDongusu;

import java.util.Scanner;

public class faktöriyel {
	
	public static void main(String args[]) 
	{
		Scanner girdi=new Scanner(System.in);
		int sayi,i;
		int carpim=1;
		
		System.out.println("Hangi sayýnýn faktöriyeli bulunacak?");
		sayi=girdi.nextInt();
		
		for(i=1;i<=sayi;i++)
		{
			carpim=carpim*i;
		}
		
		switch(sayi)
		{
			case 1:
				System.out.println(sayi+" = "+carpim);
				break;
			case 2:
				System.out.println("1*"+sayi+" = "+carpim);
				break;
			case 3:
				System.out.println("1*2*"+sayi+" = "+carpim);
				break;
			default:
				System.out.println("1*2*...*"+sayi+" = "+carpim);
				break;
			
		}
		
	}

}
