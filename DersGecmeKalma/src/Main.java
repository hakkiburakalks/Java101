import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		int matNot,fizikNot,turkceNot,kimyaNot,muzikNot;
		Scanner input = new Scanner(System.in);
		
		System.out.println("Matematik Notunuzu Giriniz");
		
		matNot = input.nextInt();
		
		if (matNot <0 && matNot >100) {
				matNot = 0;
		}
		else {
			System.out.println("Matematik Notu Girilmiþtir");
		}
       System.out.println("Fizik Notunuzu Giriniz");
		
		fizikNot = input.nextInt();
		
		if (fizikNot <0 && fizikNot >100) {
				matNot = 0;
		}
		else {
			System.out.println("Fizik Notu Girilmiþtir");
		}
		
         System.out.println("Turkce Notunuzu Giriniz");
		
		turkceNot = input.nextInt();
		
		if (turkceNot <0 && turkceNot >100) {
				turkceNot = 0;
		}
		else {
			System.out.println("Turkce Notu Girilmistir");
		}
		
        System.out.println("Kimya Notunuzu Giriniz");
		
		kimyaNot = input.nextInt();
		
		if (kimyaNot <0 && kimyaNot >100) {
				kimyaNot = 0;
		}
		else {
			System.out.println("Kimya Notu Girilmiþtir");
		}
		
        System.out.println("Muzik Notunuzu Giriniz");
		
		muzikNot = input.nextInt();
		
		if (muzikNot <0 && muzikNot >100) {
				muzikNot = 0;
		}
		
		
		
		
		double ortalama = (muzikNot + kimyaNot + turkceNot +fizikNot + matNot) / 5;
		
		
        if (ortalama >= 55 && ortalama <=100) {
        	System.out.println("Dersi Baþarýyla Tamamladýnýz");
        	System.out.println("Ortalamanýz:"+ortalama);
        }
        else if (ortalama < 55 &&  ortalama >= 0) {
        	
        	System.out.println("Dersi Tamamlayamadýnýz ");
        	System.out.println("Ortalamanýz:"+ortalama);
		}
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
