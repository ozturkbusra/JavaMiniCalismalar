package sfirst;

public class onFaktoriyel {

	public static void main(String args[])
	{
		int sayi=1;
		int sonuc=1;
		
		while(sayi<=10)
		{
			sonuc=sonuc*sayi;
			System.out.println(sayi+" Faktöriyel = "+sonuc);
			
			sayi++;
		}
	}
}
