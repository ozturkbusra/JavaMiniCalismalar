package stringMethods;

public class splitDizi {
	
	public static void main(String args[]) 
	{
		int i,j;
		
		String cumle="Bu cümle 5 kelimeden oluþur.";
		
		String[] bosluktan=cumle.split(" ");
		
		String[] kelimeler=cumle.split("ü");
		
		System.out.println(bosluktan[2]);
		System.out.println(kelimeler[0]);
		
		try 
		{
			for(i=0;i<=(bosluktan.length);i++) 
			{
				System.out.println((i+1)+". eleman : "+bosluktan[i]);
			}
		} 
		
		catch (Exception e) {
			// TODO: handle exception
		}
		
		try
		{
			for(j=0;j<=(kelimeler.length);j++) 
			{
				System.out.println((j+1)+". eleman : "+kelimeler[j]);
			}
		} 
		
		catch (Exception e) {
			// TODO: handle exception
		}		
	}
}
