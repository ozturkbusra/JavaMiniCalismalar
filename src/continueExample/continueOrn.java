package continueExample;

import java.util.Scanner;

public class continueOrn {
	public static void main(String args[]) 
	{
		int ustLimit,i,top=0,adet=0;
		
		Scanner girdi=new Scanner(System.in);
		
		System.out.println("Girece�iniz �st limite kadar olan ve \n3 ile b�l�nebilen say�lar bulunacakt�r.\n\n�st limiti giriniz : ");
		ustLimit=girdi.nextInt();
		
		for(i=1;i<=ustLimit;i++)
		{
			if(i%3!=0) 
			{
				continue;
			}
			
			System.out.println("3'e b�l�nebilen say� : "+i);
			
			top+=i;
			adet++;
		}
		
		System.out.println("1 ile "+ustLimit+" aras�nda 3 ile b�l�nebilen "+adet+" tane sayi vard�r. \nBu say�lar�n toplam� "+top+" 'a e�ittir.");
		
	}

}
