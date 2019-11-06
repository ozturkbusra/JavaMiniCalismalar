package forDongusu;

public class carpimTablosu {
	
	public static void main(String args[])
	{
		int first,second,i,c;
		
		//baslýktaký 1-10
		for(i=1;i<=10;i++)
		{
			System.out.print("          "+i+"   ");
		}
		
		//altcizgi
		System.out.println();
		
		for (c=1;c<=10;c++)
		{
			System.out.print("_______________");
		}
		
		for(first=1;first<=10;first++)
		{
			System.out.println();
			
			System.out.print(first+"  |  ");
			
			for(second=1;second<=10;second++)
			{
				System.out.print(first + " * " + second +" = "+ first*second+"     ");
			}
		}
	}

}
