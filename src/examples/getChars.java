package examples;

public class getChars {

	public static void main(String args[]) 
	{
		String isim="Avrupa";
		int i,j;
		
		char dizim[];
		dizim=new char[6];
		
		System.out.println("KARAKTER     ÝNDÝSÝ");
		
		for(i=0;i<isim.length();i++) 
		{
			System.out.println("   "+isim.charAt(i)+"           "+i);
		}
		
		System.out.println("\nYeni Dizi :");
		
		isim.getChars(2, isim.length(), dizim, 0);
		
		for(j=0;j<dizim.length-2;j++) 
		{
			System.out.println("    "+dizim[j]);
		}
	}
}
