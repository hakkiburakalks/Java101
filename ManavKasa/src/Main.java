import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		
		double armutKG = 2.14 , elmaKG = 3.67 , domatesKG = 1.11, muzKG = 0.95 , patl�canKG = 5; 
		Scanner input = new Scanner(System.in);
		
		System.out.println("Ka� Kilo Armut Alacaks�n�z:");
		int kacKiloArmut = input.nextInt();
		
		System.out.println("Ka� Kilo Elma Alacaks�n�z:");
		int kacKiloElma = input.nextInt();
		System.out.println("Ka� Kilo Domates Alacaks�n�z:");
		int kacKiloDomates = input.nextInt();
		System.out.println("Ka� Kilo Muz Alacaks�n�z:");
		int kacKiloMuz = input.nextInt();
		System.out.println("Ka� Kilo Patl�can Alacaks�n�z:");
		int kacKiloPatl�can = input.nextInt();
		
		
		double toplamTutar = (armutKG * kacKiloArmut) + (elmaKG * kacKiloElma) + (domatesKG * kacKiloDomates ) + (kacKiloMuz*muzKG) + (kacKiloPatl�can*patl�canKG);
		
		System.out.println("Toplam Tutar"+toplamTutar);
		
		
		
		
		
		
		
		
		
		
	}

}
