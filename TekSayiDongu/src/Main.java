import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		System.out.println("Bir Sayi Giriniz");
		Scanner scn = new Scanner(System.in);
		int i, sonuc = 0 ;
	
		
	while (true) {
		
		i =scn.nextInt();
		
		if (i%4== 0 && i% 2 == 0) {
			sonuc += i ;
		}
		
		else {
			
			System.out.println("Tek Sayý veya 2 ve 4'e ortak bölünmeyen bir sayý girdiniz");
			break;
		}
		
		
		
	}
		
		
		System.out.println("Girdiðiniz Sayýlarýn Toplamý "+sonuc);
		
		
		
		
		

	}

}
