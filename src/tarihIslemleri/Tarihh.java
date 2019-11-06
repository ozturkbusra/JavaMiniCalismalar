package tarihIslemleri;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

//import kýsayolu: ctrl+shift+o 
//çýktý kýsayolu: sout

public class Tarihh {
	public static void main(String args[]) throws ParseException {
		Date now=new Date();
	    System.out.println("Suan : "+now.toString());
	    
	    DateFormat nFormat=new SimpleDateFormat("yyyy/MM/dd");// ("yyyy/MM/dd") her harf anlamlý
	    System.out.println(nFormat.format(now));
	    Date tarih=nFormat.parse("1995/03/24");
	    System.out.println(tarih);
	    
	}
	


}
