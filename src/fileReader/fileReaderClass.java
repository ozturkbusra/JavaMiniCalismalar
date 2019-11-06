package fileReader;
import java.io.*; //Java'da herhangi bir dosyadan veri almak veya yazdýrmak gibi iþlemleri yapabilmemiz için gerekli olan kütüpkane
import java.util.Scanner; 


public class fileReaderClass{
	public static void main(String[] args) throws FileNotFoundException{
		
		//*String inputData;//Ýçine dosyaya atýlacak veriler atanacak
		String filePath;
		
		Scanner gir=new Scanner(System.in); //giriþler için nesne oluþturuldu. Her giriþte kullanýlabýlýr
		
		System.out.print("Dosya yolunu düz slash ile giriniz : ");
		filePath=gir.next();
		
		
		File inputFilePath=new File(filePath);
		//File inputFilePath=new File("C:\\Users\\BUSRA\\Desktop\\DosyaOkumaYazma\\InputData\\inputData1.txt");//Belirtilen yoldaki dosya için nesne oluþturduk
		//File inputFilePath=new File("C:/Users/BUSRA/Desktop/DosyaOkumaYazma/InputData/inputData1.txt");//   \\ veya / kullanýlabilir
		
		//Dosyanýn varolup olmadýðýný kontrol etme
		if (inputFilePath.exists()) {
			System.out.println("Bu dosya mevcut!");
			
			//Dosya içeriðini okuma
			Scanner inputScan=new Scanner(inputFilePath);
			//Scanner inputScan=new Scanner(new File("C:\\Users\\BUSRA\\Desktop\\DosyaOkumaYazma\\InputData\\inputData1.txt"));
			 
			int i=1;
			while (inputScan.hasNextLine()) {
				System.out.println(i+". Satýr : "+inputScan.nextLine());
				i++;
			}
		} else {
			System.out.println("Bu dosya mevcut deðil!");
		}					
	}
}
