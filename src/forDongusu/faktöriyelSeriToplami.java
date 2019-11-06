package forDongusu;

public class faktöriyelSeriToplami {
	
	public static void main(String args[])
	{
		// 1/ 2!  +  1/3! + 1/4! +...+ 1/10!
		
		double toplam=0;
		double fakt=1;
		double k;
		
			for(k=2;k<=10;k++) 
			{
				fakt=fakt*k;
				toplam=toplam+(1/fakt);
				
				System.out.println(toplam);
			}	
			System.out.println("Seri toplamý : "+toplam);		
	}
}
