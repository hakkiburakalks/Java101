package havaSicakligi;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		
		int heat;
		
		Scanner input = new Scanner(System.in);
		System.out.println("Hava S�cakl���n� Giriniz");
		heat = input.nextInt();
		
		if (heat < 5) {
			System.out.println("Kayak Yapabilirsiniz");
		}
		else if (heat >= 5 && heat <15) {
			System.out.println("Sinemaya Gidebilirsiniz");
		}
		else if (heat >=15 && heat <25) {
			System.out.println("Pikni�e Gidebilirsiniz");
		}
		
		else {
			System.out.println("Y�zme Yapabilirsiniz");
		}
		
		
		
		

	}

}
