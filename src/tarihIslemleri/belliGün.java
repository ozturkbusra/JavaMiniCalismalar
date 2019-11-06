package tarihIslemleri;

import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

public class belliGün {
	//main methodu için : ma yaz maini sec
	public static void main(String[] args) {
		Calendar takvim= new GregorianCalendar(1995,02,24); //ay sýfýrdan baþlýyor. indis tarzý
		Date tarih=takvim.getTime();
		System.out.println(tarih.toString());
	}

}
