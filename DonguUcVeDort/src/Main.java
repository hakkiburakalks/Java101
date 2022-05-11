import java.util.Scanner;

public class Main {
	
	public static void main(String[] args) {
		
	int number;	
	Scanner scn = new Scanner(System.in);	
	double avarage = 0;	
	System.out.println("Lütfen Bir Sayý Giriniz");	
	number = scn.nextInt();	
		
	for (int i=0;i<=number;i++) {	
		
		
	if (i%3 == 0 && i % 4 == 0) { 
		avarage += i;
	
	}

			
	}
	
	double realAvarage = avarage / number;
	System.out.println(realAvarage);
	
	}

}
