package examples;

public class compareTo {

	public static void main(String args[]) 
	{
		String birinci="Zeki";
		int i;
		
		i=birinci.compareTo("Akýllý");
		
		if(i==0)
		{	
			System.out.println("");
			System.out.println(birinci+" = Akýllý");
		}
		if(i<0)
		{
			System.out.println("");
			System.out.println(birinci+" < Akýllý");
		}
		if(i>0)
		{
			System.out.println("");
			System.out.println(birinci+" > Akýllý");
		}
		
		System.out.println("i : "+i);
	}
}
