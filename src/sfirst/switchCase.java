package sfirst;

import java.util.Scanner;

public class switchCase {

	public static void main(String args[])
	{
		Scanner girdi=new Scanner(System.in);
		
		int secim;
		System.out.print("Se�im yap�n�z 1-2-3 : ");
		secim=girdi.nextInt();
		
		switch(secim)
		{
			case 1:
				System.out.println("1'i sectiniz..");
				break;
			
			case 2:
				System.out.println("2'yi sectiniz..");
				break;
				
			case 3:
				System.out.println("3'� sectiniz..");
				break;
				
			default:
				System.out.println("Ge�ersiz de�er girdiniz.");
				break;
		}
	}
}
