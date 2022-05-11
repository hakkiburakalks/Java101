
import java.util.Scanner;



public class Main {

	public static void main(String[] args) {
		
		int s,k,giris;
		int yildiz,bosluk;
		Scanner input = new Scanner(System.in);
		System.out.println("Giris Miktarini Giriniz: ");
		giris = input.nextInt();
		
		yildiz = 1;
		bosluk = giris -1;
		
		for (k= 0; k<giris; k++) {
			for (s=0;s <bosluk; s++) {
				System.out.print(" ");
			}
			
		for (s=0;s<yildiz;s++) {
			System.out.print("*");
		}
			
		System.out.print("\n");
		bosluk--;
		yildiz +=2;
			
			
		}
		yildiz -=2;
		bosluk= 0;
		
		
		for (k= 0; k<giris; k++) {
			for (s=0;s <bosluk; s++) {
				System.out.print(" ");
			}
			
		for (s=0;s<yildiz;s++) {
			System.out.print("*");
		}
			
		System.out.print("\n");
		bosluk++;
		yildiz -=2;
			
			
		}
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
