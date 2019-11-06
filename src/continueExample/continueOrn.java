package continueExample;

import java.util.Scanner;

public class continueOrn {
	public static void main(String args[]) 
	{
		int ustLimit,i,top=0,adet=0;
		
		Scanner girdi=new Scanner(System.in);
		
		System.out.println("Gireceðiniz üst limite kadar olan ve \n3 ile bölünebilen sayýlar bulunacaktýr.\n\nÜst limiti giriniz : ");
		ustLimit=girdi.nextInt();
		
		for(i=1;i<=ustLimit;i++)
		{
			if(i%3!=0) 
			{
				continue;
			}
			
			System.out.println("3'e bölünebilen sayý : "+i);
			
			top+=i;
			adet++;
		}
		
		System.out.println("1 ile "+ustLimit+" arasýnda 3 ile bölünebilen "+adet+" tane sayi vardýr. \nBu sayýlarýn toplamý "+top+" 'a eþittir.");
		
	}

}
