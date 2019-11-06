package stringMethods;

public class startsWith_endsWith {
	
	public static void main(String args[]) 
	{
		String[] iller= {"Ankara","Antalya","Burdur","Bursa","Anadolu"};
		
		int i;
		
		for(i=0;i<iller.length;i++) 
		{
			if(iller[i].startsWith("An")) 
			{
				System.out.println(iller[i]+" þehri an ile baþlýyor");
			}
		}
		
		for(i=0;i<iller.length;i++) 
		{
			if(iller[i].endsWith("a")) 
			{
				System.out.println(iller[i]+" þehri a ile bitiyor.");
			}			
		}
		
		for(i=0;i<iller.length;i++) 
		{
			if(iller[i].startsWith("ka",2)) 
			{
					System.out.println(iller[i]+" þehri 2. indisinden itibaren ka ile baþlýyor");
			}
		}
	}

}
