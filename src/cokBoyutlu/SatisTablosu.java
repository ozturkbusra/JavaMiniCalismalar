package cokBoyutlu;

public class SatisTablosu {
	public static void main(String[] args) {
		int[][] satisTablosu=new int[][] {
		{700,600,650},
		{900,800,700},
		{300,400,350},
		{500,450,470},
		{600,500,480}
	};
	
	int i,j;
	System.out.println("Satýs Tablosu");
	
	for(i=0;i<=4;i++) {
		for(j=0;j<=2;j++) {
			System.out.print(satisTablosu[i][j]+" ");
		}
		System.out.println();
		}
	}
}
