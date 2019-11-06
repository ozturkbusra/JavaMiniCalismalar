package fileReader;
import java.io.*; //Java'da herhangi bir dosyadan veri almak veya yazd�rmak gibi i�lemleri yapabilmemiz i�in gerekli olan k�t�pkane
import java.util.Scanner; 


public class fileReaderClass{
	public static void main(String[] args) throws FileNotFoundException{
		
		//*String inputData;//��ine dosyaya at�lacak veriler atanacak
		String filePath;
		
		Scanner gir=new Scanner(System.in); //giri�ler i�in nesne olu�turuldu. Her giri�te kullan�lab�l�r
		
		System.out.print("Dosya yolunu d�z slash ile giriniz : ");
		filePath=gir.next();
		
		
		File inputFilePath=new File(filePath);
		//File inputFilePath=new File("C:\\Users\\BUSRA\\Desktop\\DosyaOkumaYazma\\InputData\\inputData1.txt");//Belirtilen yoldaki dosya i�in nesne olu�turduk
		//File inputFilePath=new File("C:/Users/BUSRA/Desktop/DosyaOkumaYazma/InputData/inputData1.txt");//   \\ veya / kullan�labilir
		
		//Dosyan�n varolup olmad���n� kontrol etme
		if (inputFilePath.exists()) {
			System.out.println("Bu dosya mevcut!");
			
			//Dosya i�eri�ini okuma
			Scanner inputScan=new Scanner(inputFilePath);
			//Scanner inputScan=new Scanner(new File("C:\\Users\\BUSRA\\Desktop\\DosyaOkumaYazma\\InputData\\inputData1.txt"));
			 
			int i=1;
			while (inputScan.hasNextLine()) {
				System.out.println(i+". Sat�r : "+inputScan.nextLine());
				i++;
			}
		} else {
			System.out.println("Bu dosya mevcut de�il!");
		}					
	}
}
