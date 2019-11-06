package fileWriter;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class fileWriterClass {
	public static void main(String[] args) throws IOException {
		//String yazilacak="Yazýlacak veriler.";
		//String path="C:/Users/BUSRA/Desktop/DosyaOkumaYazma/yazma1.txt";
		String path,yazilacak,textAdi;
		
		Scanner girdi=new Scanner(System.in);
		
		System.out.println("Yazýlacak verileri giriniz : ");
		yazilacak=girdi.next();
		
		System.out.println("\nKaydedilecek yolu düz slash ile giriniz : ");		
		path=girdi.next();
		
		int sonIndex=path.length()-1; //path'in son harfinin indexini bulduk
		String sonHarf=path.substring(sonIndex);//substring:baþladýðý ýndexten en sona kadar olan strýngý gerý donduruyor. Biz zaten son ýndexten baslattýgýmýz ýcýn sadece son harfý alacak
		
		//Bekleme yapýlacaksa
		try {
			Thread.sleep(1);
		} catch (InterruptedException e) {}
		
		System.out.println("\nOluþturulacak Text adýný giriniz : ");
		textAdi=girdi.next();
		
		//File file=new File(path+"/"+textAdi+".txt");
		File file;
		
		if (sonHarf.equals("/")) //son harfin karsýlastýrmasýný yaptýk
		{			
			file=new File(path+textAdi+".txt");// path belirtmeyip sadece .txt uzantýlý dosya adý yazarsak Eclipse dosyalarýnda bu projenýn ýcýne kayýt yapar
		} else {
			file=new File(path+"/"+textAdi+".txt");
		}
		
		
		if(!file.exists()) {
			file.createNewFile();
		}
		
		FileWriter fileWriter=new FileWriter(file, false); //File tipindeki bir degiþkený yazma amacýna yarar
		//boolean deger,append modu.Dosyanýn ýcýnde yer alan mevcut metýnlere dokunmadan dosyanýn son karakterýnden ýtýbaren yazma ýslemýný baslatýr
		//false oldugu ýcýn, dosya her seferýnde bastan yazýlacak.
		BufferedWriter bWriter=new BufferedWriter(fileWriter);//Dosyaya býr kayýt yazarken
		bWriter.write(yazilacak);//yazma ýsý baslatýlýr
		bWriter.close();
	}

}