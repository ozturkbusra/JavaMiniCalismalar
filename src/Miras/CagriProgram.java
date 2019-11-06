package Miras;

public class CagriProgram {
	public static void main(String[] args) {
		
		Vergi vergiKirtasiye=new Vergi();
		vergiKirtasiye.vergiNo=1111111111;
		
		Vergi vergiBakkal=new Vergi();
		vergiBakkal.vergiNo=1222222222;
		
		Bakkal bakkal=new Bakkal();
		bakkal.adres="Cebeci";
		bakkal.dukkanAdi="Yýlmaz";
		bakkal.sekerleme="Cikolata";
		bakkal.vergi=vergiBakkal;
		
		System.out.println("Adres : "+bakkal.adres+"\nDukkan Adý : "+bakkal.dukkanAdi+"\nSekerleme turu: "+bakkal.sekerleme+"\n"+ bakkal.isBasla()+"\n"+bakkal.isBitis() );
		bakkal.kira();
		bakkal.vergiNosu();
		
		System.out.println("\n");
		
		Kirtasiye kirtasiye=new Kirtasiye();
		kirtasiye.adres="Fatih";
		kirtasiye.dukkanAdi="Elips";
		kirtasiye.vergi=vergiKirtasiye;
		
		
		System.out.println("Adres : "+kirtasiye.adres+"\nDukkan Adý : "+kirtasiye.dukkanAdi+"\nKalem sayisi : "+kirtasiye.kalemSayisi+"\n"+ kirtasiye.isBasla()+"\n"+kirtasiye.isBitis()+"\nCalisan sayisi : "+ kirtasiye.calisanSayisi() );
		kirtasiye.kira();
		kirtasiye.vergiNosu();
		
	}

}
