package cokBoyutlu;

import java.util.Scanner;

public class ikiBoyutlu {
	public static void main(String[] args) {
		int[][] girilecek=new int[3][2];
		
		Scanner girdi=new Scanner(System.in);
		int i,j;
		
		for(i=0;i<=2;i++) {
			for(j=0;j<=1;j++) {
			System.out.println((i+1) +". sat�r "+ (j+1) +". s�tundaki eleman� giriniz : ");
		girilecek[i][j]=girdi.nextInt();
		
		}}
		System.out.println("Sat�s Tablosu");
		
		for(i=0;i<=2;i++) {
			for(j=0;j<=1;j++) {
		
		System.out.print(girilecek[i][j]+"  ");
		}
			System.out.println();}
		
	}
}
