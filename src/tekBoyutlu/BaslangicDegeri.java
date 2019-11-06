package tekBoyutlu;

public class BaslangicDegeri {
	public static void main(String[] args) {
		int [] x = {2,4,3,7,1};
		
		double t=0;
		int i,j;
		
		for(i=0;i<=4;i++) {
			
			t=t+x[i];
			System.out.print(x[i]);
			
			j=0;
			
			if (i==4) {
				j--;
			}
			
			while(j==0) {
				System.out.print(" + ");
				j--;
			}
			
		}
		System.out.println(" = "+t);
		
	}

}
