package forDongusu;

public class alterneSeriToplami {
	
	public static void main(String args[])
	{
		// 1.2/(3.4)­5.6/(7.8)+9.10/(11.12)­13.14/(15.16)
		
		double toplam=0,x=0;
		int e=1,i;
		
		
		for(i=1;i<=4;i++) 
		{
			toplam=toplam+((x+1)*(x+2)/((x+3)*(x+4)))*e;
			x=x+4;
			e*=-1;
			
		}
		
		System.out.println("Toplam = "+toplam);
		
	}

}
