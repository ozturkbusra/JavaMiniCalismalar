package stringMethods;

public class bytes {
	
	public static void main(String args[]) 
	{
		int i;
		String cumle="nas�ls�n ki";
		
		byte[] dizim=cumle.getBytes();
		
		System.out.println(new String(dizim)); //byte dizisi tekrar string'e donusturuluy�r
		
		System.out.println("\nToplam 11 karakter var.\n");
		
		for(i=0;i<dizim.length;i++) 
		{
			System.out.println((i+1)+". karakterin byte de�er� : "+dizim[i]);
		}
		
	}

}
