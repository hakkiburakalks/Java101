import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int toplam = 0;
		
		System.out.println("Bir Sayi Giriniz");
		int sayi = scn.nextInt();

		
		
		while (sayi > 0) {
		
			toplam += sayi % 10;
			sayi /= 10;
		}
		
		
		System.out.println("Girilen Sayýnýn Rakamlarýnýn Toplamý "+toplam);
	}

}
