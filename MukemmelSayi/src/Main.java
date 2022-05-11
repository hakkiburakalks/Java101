import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		int toplam= 0;
		System.out.println("Bir Sayi Giriniz:");
		Scanner input = new Scanner(System.in);
		int sayi = input.nextInt();
		
		
		for (int i = 1 ; i < sayi; i++) {
			
			if (sayi % i == 0) {
				toplam += i;
				
			}
			

		}
		
		
		if (sayi == toplam) {
			System.out.println("Mükemmel Sayý");
		}
		else {
			System.out.println("Mükemmel Sayý Deðidlir");
		}
		
	
		

	}

}
