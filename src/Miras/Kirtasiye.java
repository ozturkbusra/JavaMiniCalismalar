package Miras;

public class Kirtasiye extends DukkanOrtak{
	
	int kalemSayisi=55;
	
	Vergi vergi;
	
	@Override
	void kira() {
		System.out.println("Kirasý 870 tl dir.");
	}
	
	long calisanSayisi() {
		return 4;
	}
	
	void vergiNosu() {
		System.out.println("Kirtasiyenin vergi numarasi : "+ vergi.vergiNo);
	}
	

}
