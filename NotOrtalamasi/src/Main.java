import java.util.Scanner;


public class Main {

	public static void main(String[] args) {
		int matNot, fizikNot, turkceNot, kimyaNot, tarihNot , muzikNot;
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Matematik Notunu Giriniz");
		matNot = input.nextInt();
		
		System.out.println("Fizik Notunu Giriniz");
	    fizikNot = input.nextInt();
		
		
		System.out.println("Turkce Notunu Giriniz");
		turkceNot = input.nextInt();
		
		
		System.out.println("Kimya Notunu Giriniz");
		kimyaNot = input.nextInt();
		
		
		System.out.println("Tarih Notunu Giriniz");
		tarihNot = input.nextInt();
		
		
		System.out.println("Muzik Notunu Giriniz");
		muzikNot = input.nextInt();
		
	    float notOrt = (matNot + fizikNot + turkceNot + kimyaNot + tarihNot + muzikNot) / 6;
		
		if (notOrt <= 60) {
			
			System.out.println("Sýnýftan Kaldýnýz");
			
		}
		
		else {
			System.out.println("Sýnýftan Geçtiniz");
		}
		
		
		
		

	}

}
