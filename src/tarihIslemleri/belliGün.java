package tarihIslemleri;

import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

public class belliG�n {
	//main methodu i�in : ma yaz maini sec
	public static void main(String[] args) {
		Calendar takvim= new GregorianCalendar(1995,02,24); //ay s�f�rdan ba�l�yor. indis tarz�
		Date tarih=takvim.getTime();
		System.out.println(tarih.toString());
	}

}
