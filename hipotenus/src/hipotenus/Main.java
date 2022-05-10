package hipotenus;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
	/*	
		int a , b;
		double c;
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("A Kenarýný Giriniz");
		a = input.nextInt();
		System.out.println("B Kenarýný Giriniz");
		b = input.nextInt();
		
		c = Math.sqrt(Math.pow(a, 2)+ Math.pow(b, 2));
		
		System.out.println(c);
		
		*/
		
		
		int a , b ,c ;
		
		
	    Scanner input = new Scanner(System.in);
		System.out.println("A Kenarýný Giriniz");
		a = input.nextInt();
		System.out.println("B Kenarýný Giriniz");
		b = input.nextInt();
		
		System.out.println("C Kenarýný Giriniz");
		c = input.nextInt();
		
        double u = (a+b+c)/2;
		
		double cevre = 2*u;
			
		double alan = Math.sqrt(u*(u-a)*(u-b)*(u-c));
		
		
		System.out.println("Üçgenin Çevresi:"+cevre);
		System.out.println("Üçgenin Alaný:"+alan);
		
		
		
		
	}

}
