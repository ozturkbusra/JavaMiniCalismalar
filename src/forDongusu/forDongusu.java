package forDongusu;

import java.util.Scanner;

public class forDongusu {
	
	public static void main(String args[])
	{
		Scanner girdi=new Scanner (System.in);
		int s;
		int i;
		int toplam=0;
		
		System.out.println("Kaça kadar sayýlar toplansýn?");
		s=girdi.nextInt();
		
		for(i=1;i<=s;i++)
		{
			toplam+=i;
		}
		
		switch(s)
		{
		case 1:
			System.out.println(s + " = " + toplam);
			break;
		case 2:
			System.out.println("1+" + s + "=" + toplam);
			break;
		case 3:
			System.out.println("1+2+"+s+"="+toplam);
			break;
		case 4:
			System.out.println("1+2+3+"+s+"="+toplam);
			break;
		default:
			System.out.println("1+2+3+...+"+s+"="+toplam);
			break;
		}							
	}
}
