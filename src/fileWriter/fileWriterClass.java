package fileWriter;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class fileWriterClass {
	public static void main(String[] args) throws IOException {
		//String yazilacak="Yaz�lacak veriler.";
		//String path="C:/Users/BUSRA/Desktop/DosyaOkumaYazma/yazma1.txt";
		String path,yazilacak,textAdi;
		
		Scanner girdi=new Scanner(System.in);
		
		System.out.println("Yaz�lacak verileri giriniz : ");
		yazilacak=girdi.next();
		
		System.out.println("\nKaydedilecek yolu d�z slash ile giriniz : ");		
		path=girdi.next();
		
		int sonIndex=path.length()-1; //path'in son harfinin indexini bulduk
		String sonHarf=path.substring(sonIndex);//substring:ba�lad��� �ndexten en sona kadar olan str�ng� ger� donduruyor. Biz zaten son �ndexten baslatt�g�m�z �c�n sadece son harf� alacak
		
		//Bekleme yap�lacaksa
		try {
			Thread.sleep(1);
		} catch (InterruptedException e) {}
		
		System.out.println("\nOlu�turulacak Text ad�n� giriniz : ");
		textAdi=girdi.next();
		
		//File file=new File(path+"/"+textAdi+".txt");
		File file;
		
		if (sonHarf.equals("/")) //son harfin kars�last�rmas�n� yapt�k
		{			
			file=new File(path+textAdi+".txt");// path belirtmeyip sadece .txt uzant�l� dosya ad� yazarsak Eclipse dosyalar�nda bu projen�n �c�ne kay�t yapar
		} else {
			file=new File(path+"/"+textAdi+".txt");
		}
		
		
		if(!file.exists()) {
			file.createNewFile();
		}
		
		FileWriter fileWriter=new FileWriter(file, false); //File tipindeki bir degi�ken� yazma amac�na yarar
		//boolean deger,append modu.Dosyan�n �c�nde yer alan mevcut met�nlere dokunmadan dosyan�n son karakter�nden �t�baren yazma �slem�n� baslat�r
		//false oldugu �c�n, dosya her sefer�nde bastan yaz�lacak.
		BufferedWriter bWriter=new BufferedWriter(fileWriter);//Dosyaya b�r kay�t yazarken
		bWriter.write(yazilacak);//yazma �s� baslat�l�r
		bWriter.close();
	}

}