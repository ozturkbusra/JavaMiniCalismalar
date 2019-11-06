package Miras;

public class Bakkal extends DukkanOrtak{
	
		String sekerleme;
		
		Vergi vergi;
		
		@Override
		public String isBasla() {
			return "Bakkal 7de ise baslar";
		} 
		
		void vergiNosu() {
			System.out.println("Bakkalin vergi numarasi : "+ vergi.vergiNo);
		}
		
}
