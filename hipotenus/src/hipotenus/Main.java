package hipotenus;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
	/*	
		int a , b;
		double c;
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("A Kenar�n� Giriniz");
		a = input.nextInt();
		System.out.println("B Kenar�n� Giriniz");
		b = input.nextInt();
		
		c = Math.sqrt(Math.pow(a, 2)+ Math.pow(b, 2));
		
		System.out.println(c);
		
		*/
		
		
		int a , b ,c ;
		
		
	    Scanner input = new Scanner(System.in);
		System.out.println("A Kenar�n� Giriniz");
		a = input.nextInt();
		System.out.println("B Kenar�n� Giriniz");
		b = input.nextInt();
		
		System.out.println("C Kenar�n� Giriniz");
		c = input.nextInt();
		
        double u = (a+b+c)/2;
		
		double cevre = 2*u;
			
		double alan = Math.sqrt(u*(u-a)*(u-b)*(u-c));
		
		
		System.out.println("��genin �evresi:"+cevre);
		System.out.println("��genin Alan�:"+alan);
		
		
		
		
	}

}
