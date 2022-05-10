import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		
		double armutKG = 2.14 , elmaKG = 3.67 , domatesKG = 1.11, muzKG = 0.95 , patlýcanKG = 5; 
		Scanner input = new Scanner(System.in);
		
		System.out.println("Kaç Kilo Armut Alacaksýnýz:");
		int kacKiloArmut = input.nextInt();
		
		System.out.println("Kaç Kilo Elma Alacaksýnýz:");
		int kacKiloElma = input.nextInt();
		System.out.println("Kaç Kilo Domates Alacaksýnýz:");
		int kacKiloDomates = input.nextInt();
		System.out.println("Kaç Kilo Muz Alacaksýnýz:");
		int kacKiloMuz = input.nextInt();
		System.out.println("Kaç Kilo Patlýcan Alacaksýnýz:");
		int kacKiloPatlýcan = input.nextInt();
		
		
		double toplamTutar = (armutKG * kacKiloArmut) + (elmaKG * kacKiloElma) + (domatesKG * kacKiloDomates ) + (kacKiloMuz*muzKG) + (kacKiloPatlýcan*patlýcanKG);
		
		System.out.println("Toplam Tutar"+toplamTutar);
		
		
		
		
		
		
		
		
		
		
	}

}
