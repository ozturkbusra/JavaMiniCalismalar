package tarihIslemleri;

import java.util.Date;

public class tarihIslemleri {
	
	public static void main(String args[]) 
	{
		Date zaman=new Date();
		
		System.out.println("�uan : "+zaman.toString());
		
		System.out.println("Unix Timestamp : "+zaman.getTime());
	}

}
