package kdvCalculator;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		   
			Scanner input = new Scanner(System.in);
			
			System.out.println("KDV'siz ana paralý fiyatý giriniz");
			
			double nonKdvPrice = input.nextDouble();
			
			double kdv;
			if (nonKdvPrice <1000) {
				 kdv = 0.18 ;
			}
			else {
				kdv = 0.8;
			}
			
			double kdvPirice = nonKdvPrice * kdv;

			double priceWithKdv = nonKdvPrice + (kdvPirice);
			
			
			System.out.println("Kdv'li tutar:"+priceWithKdv);
			System.out.println("kdv miktari:"+kdvPirice);
			System.out.println("kdv oraný:"+kdv);
			System.out.println("Kdv'siz tutar:"+nonKdvPrice);
	}

}
