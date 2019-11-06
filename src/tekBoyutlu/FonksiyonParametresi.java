package tekBoyutlu;

public class FonksiyonParametresi {
public static void main(String[] args) {
	
	int[] a= {3,5,2,7,1};
	double toplam=diziTopla(a, 5);
	System.out.println(toplam);
	
}

static int diziTopla(int[] x, int n) {
	
	int toplam=0,i;
	
	for(i=0;i<n;i++) {
		toplam=toplam+x[i];
	}
	
	return toplam;
}
}