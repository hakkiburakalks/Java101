import java.util.Scanner;

public class Main {

	
	public static void main(String[] args) {
		
		double weight ,length;
		Scanner input = new Scanner(System.in);
		System.out.println("Kilonuzu Giriniz:");
		weight = input.nextDouble();
		System.out.println("Boyunuzu Giriniz:");
		length = input.nextDouble();
		
		double bodyMassIndex = weight / (length*length);
		
		System.out.println("Vücut Kitle Ýndeksiniz :"+bodyMassIndex);
		
		
		
	}
}
