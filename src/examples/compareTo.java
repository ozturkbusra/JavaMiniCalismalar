package examples;

public class compareTo {

	public static void main(String args[]) 
	{
		String birinci="Zeki";
		int i;
		
		i=birinci.compareTo("Ak�ll�");
		
		if(i==0)
		{	
			System.out.println("");
			System.out.println(birinci+" = Ak�ll�");
		}
		if(i<0)
		{
			System.out.println("");
			System.out.println(birinci+" < Ak�ll�");
		}
		if(i>0)
		{
			System.out.println("");
			System.out.println(birinci+" > Ak�ll�");
		}
		
		System.out.println("i : "+i);
	}
}
